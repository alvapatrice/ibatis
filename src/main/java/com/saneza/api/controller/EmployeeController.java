package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import com.saneza.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *created by gatete rugamba
 * on 10/18/2018
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees.ey")
    public String getEmployees(EmployeeFilter employeeFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<Employee> employees=employeeService.getEmployees(employeeFilter);
        resultMap.put("data",employees);
        resultMap.put("totalaccount",employeeService.countAll(employeeFilter));
        resultMap.put("page",employeeFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);

    }
    @PostMapping("/employee.ey")
    public String getEmployee(EmployeeFilter employeeFilter){
        Map<String,Object> resultMap=new HashMap<>();
        Employee employee=employeeService.getEmployee(employeeFilter);
        resultMap.put("data",employee);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/create.ey")
    public String createEmployee(EmployeeForm employeeForm){
        employeeService.createEmployee(employeeForm);
        return "done";
    }
}
