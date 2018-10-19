package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.SupplierFilter;
import com.saneza.api.model.FormFilters.SupplierForm;
import com.saneza.api.model.Supplier;
import com.saneza.api.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Sp")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/one.sp")
    public String getSupplier(SupplierFilter supplierFilter){
        Map<String,Object> resultMap=new HashMap<>();
        Supplier supplier=supplierService.getSupplier(supplierFilter);
        resultMap.put("data",supplier);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/all.sp")
    public String getSuppliers(SupplierFilter supplierFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<Supplier> supplier=supplierService.getSuppliers(supplierFilter);
        resultMap.put("data",supplier);
        resultMap.put("totalaccount",supplierService.countAll(supplierFilter));
        resultMap.put("page",supplierFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);

    }
    @PostMapping("/create.ey")
    public String createSupplier(SupplierForm supplierForm){
        supplierService.createSupplier(supplierForm);
        return "done";
    }
}
