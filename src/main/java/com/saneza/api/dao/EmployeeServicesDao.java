package com.saneza.api.dao;

import com.saneza.api.model.EmployeeServices;
import com.saneza.api.model.FormFilters.EmployeeServicesFilter;
import com.saneza.api.model.FormFilters.EmployeeServicesForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 10/19/2018
 *this is the @joinTable S" DAO of services and employees
 */
@Mapper
public interface EmployeeServicesDao
{
    //for geting employees
    public List<EmployeeServices> getAllEmployeeServices(EmployeeServicesFilter employeeServicesFilter);
    //for geting one
    public EmployeeServices getEmployeeServices(EmployeeServicesFilter employeeServicesFilter);
//for counting all
    public int countAll(EmployeeServicesFilter employeeServicesFilter);
    //for inserting data
    public void insertEmployeeServices(EmployeeServicesForm employeeServicesForm);
}
