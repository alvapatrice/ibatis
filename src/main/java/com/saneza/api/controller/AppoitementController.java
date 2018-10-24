package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.Appoitement;
import com.saneza.api.model.FormFilters.AppoitementFilter;
import com.saneza.api.model.FormFilters.AppoitementForm;
import com.saneza.api.service.AppoitementService;
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
 * */
@RestController
@RequestMapping("app")
public class AppoitementController
{
    @Autowired
    private AppoitementService appoitementService;

    @PostMapping("/all.app")
    public String getAppoitements(AppoitementFilter appoitementFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<Appoitement> appoitements=appoitementService.getAppoitements(appoitementFilter);
        resultMap.put("data",appoitements);
        resultMap.put("tatalappoitements",appoitementService.countAll(appoitementFilter));
        resultMap.put("pages",appoitementFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }

    @PostMapping("one.app")
    public String getAppoitement(AppoitementFilter appoitementFilter){
        Map<String,Object> resultMap=new HashMap<>();
        Appoitement appoitement=appoitementService.getAppoitement(appoitementFilter);
        resultMap.put("data",appoitement);
        return ReturnUtil.resultSuccess(resultMap);
    }

    @PostMapping("insert.app")
    public String insertAppoitement(AppoitementForm appoitementForm){
        return appoitementService.insertAppoitement(appoitementForm);
    }

    /**
     * for updating  the serive in the appoitemnt
     * @param appoitementForm
     * @return
     */
    @PostMapping("service.app")
    public String updateService(AppoitementForm appoitementForm){
        return appoitementService.updateService(appoitementForm);
    }
    @PostMapping("status.app")
    public String updateStatus(AppoitementForm appoitementForm){
        return appoitementService.updateStatus(appoitementForm);
    }
}
