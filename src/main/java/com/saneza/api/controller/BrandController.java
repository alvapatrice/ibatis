package com.saneza.api.controller;
/**
 *created by gatete rugamba
 * on 10/18/2018
 */

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.Brand;
import com.saneza.api.model.FormFilters.BrandFilter;
import com.saneza.api.model.FormFilters.BrandForm;
import com.saneza.api.service.BrandService;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@RestController
@RequestMapping("br")
public class BrandController
{
    @Autowired
    private BrandService brandService;

    @PostMapping("all.br")
    public String getBrands(BrandFilter brandFilter) {
        Map<String,Object> resultMap=new HashMap<>();
        List<Brand> brands=brandService.getBrands(brandFilter);
        resultMap.put("data",brands);
        resultMap.put("allBrands",brandService.countAll(brandFilter));
        resultMap.put("pages",brandFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("one.br")
    public String getBrand(BrandFilter brandFilter){
        Map<String,Object> resultMap=new HashMap<>();
        Brand brand=brandService.getBrand(brandFilter);
        resultMap.put("data",brand);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("create.br")
    public String insert(BrandForm brandForm){
        brandService.insertBrand(brandForm);
        return "done";
    }
}
