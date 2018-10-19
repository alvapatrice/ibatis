package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.EmployeeServices;
import com.saneza.api.model.FormFilters.EmployeeServicesFilter;
import com.saneza.api.model.FormFilters.EmployeeServicesForm;
import com.saneza.api.service.EmployeeServicesService;
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
@RequestMapping("/es")
public class EmployeeServicesController
{
    @Autowired
    private EmployeeServicesService employeeServicesService;
    @PostMapping("/all.es")
    public String getAllEmployeeServices(EmployeeServicesFilter employeeServicesFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<EmployeeServices> employeeServices=
                employeeServicesService.getEmployeeServicess(employeeServicesFilter);
        resultMap.put("data",employeeServices);
        resultMap.put("total",employeeServicesService.countAll(employeeServicesFilter));
        resultMap.put("page",employeeServicesFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/one.es")
    public String getEmployeeServices(EmployeeServicesFilter employeeServicesFilter){
        Map<String,Object> resultMap=new HashMap<>();
        EmployeeServices employeeServices=employeeServicesService.
                getEmployeeServices(employeeServicesFilter);
        resultMap.put("data",employeeServices);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("insert.es")
    public String insertEmployeeServices(EmployeeServicesForm employeeServicesForm){
        employeeServicesService.insertEmployeeServices(employeeServicesForm);
        return "done";
    }
}
