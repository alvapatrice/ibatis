package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.ShopBranchFilter;
import com.saneza.api.model.ShopBranch;
import com.saneza.api.service.ShopBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String getBranch(ShopBranchFilter shopBranchFilter){
        Map<String,Object> resultMap=new HashMap<>();
        ShopBranch shopBranch=shopBranchService.getBranch(shopBranchFilter);
        resultMap.put("this",shopBranch);
        return ReturnUtil.resultSuccess(resultMap);
    }
}
