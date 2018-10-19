package com.saneza.api.service;

import com.saneza.api.model.EmployeeServices;
import com.saneza.api.model.FormFilters.EmployeeServicesFilter;
import com.saneza.api.model.FormFilters.EmployeeServicesForm;

import java.util.List;

/**
 *created by gatete rugamba
 * on 10/19/2018
 */
public interface EmployeeServicesService
{
    //for getting info
    public List<EmployeeServices> getEmployeeServicess(EmployeeServicesFilter employeeServicesFilter);
//for gt info
    public EmployeeServices getEmployeeServices(EmployeeServicesFilter employeeServicesFilter);

    //for counting all
    public int countAll(EmployeeServicesFilter employeeServicesFilter);
    //for inserting data
    public void insertEmployeeServices(EmployeeServicesForm employeeServicesForm);
}
