package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.ShopBranchFilter;
import com.saneza.api.model.FormFilters.ShopBranchForm;
import com.saneza.api.model.ShopBranch;
import com.saneza.api.service.ShopBranchService;
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
@RequestMapping("/branche")
public class ShopBranchController
{
   @Autowired
    private ShopBranchService shopBranchService;

@PostMapping("/branches.bs")
    public String getBranchesList(ShopBranchFilter shopBranchFilter){

        Map<String,Object> resultMap=new HashMap<>();
        List<ShopBranch> branches=shopBranchService.getBranches(shopBranchFilter);
        resultMap.put("data",branches);
        resultMap.put("totalaccount",shopBranchService.count(shopBranchFilter));
        resultMap.put("page",shopBranchFilter.getPage());

    return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/get.bs")
    public String getBranch(ShopBranchFilter shopBranchFilter){
        Map<String,Object> resultMap=new HashMap<>();
        ShopBranch shopBranch=shopBranchService.getBranch(shopBranchFilter);
        resultMap.put("this",shopBranch);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/create.bs")
    public String createShopBranch(ShopBranchForm shopBranchForm){
        shopBranchService.createShopBranch(shopBranchForm);
        return "done";
    }
    @PostMapping("/delete.bs")
    public String delete(ShopBranchFilter shopBranchFilter)
    {
        shopBranchService.deleteShopBranch(shopBranchFilter);

        return "done";
    }
    @PostMapping("/them.bs")
    public String getThem(ShopBranchFilter shopBranchFilter){

        Map<String,Object> resultMap=new HashMap<>();
        List<ShopBranch> branches=shopBranchService.getThem(shopBranchFilter);
        resultMap.put("data",branches);
        resultMap.put("totalaccount",shopBranchService.count(shopBranchFilter));
        resultMap.put("page",shopBranchFilter.getPage());

        return ReturnUtil.resultSuccess(resultMap);
    }

}