package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.BranchService;
import com.saneza.api.model.FormFilters.BranchServiceFilter;
import com.saneza.api.model.FormFilters.BranchServiceForm;
import com.saneza.api.service.BranchServiceService;
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
@RequestMapping("bs")
public class BranchServiceController
{
    @Autowired
    private BranchServiceService branchServiceService;
    @PostMapping("all.bs")
    public String getAll(BranchServiceFilter branchServiceFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<BranchService> branchServices=branchServiceService.getAll(branchServiceFilter);
        resultMap.put("data",branchServices);
        resultMap.put("totalbranches",branchServiceService.countAll(branchServiceFilter));
        resultMap.put("pages",branchServiceFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("one.bs")
    public String getOne(BranchServiceFilter branchServiceFilter){
        Map<String,Object> resultMap=new HashMap<>();
        BranchService branchService=branchServiceService.getBranchService(branchServiceFilter);
        resultMap.put("data",branchService);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("insert.bs")
    public String inesrt(BranchServiceForm branchServiceForm){
        branchServiceService.insert(branchServiceForm);
        return "done";
    }
}
