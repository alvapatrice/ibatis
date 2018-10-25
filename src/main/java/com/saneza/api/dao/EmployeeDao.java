package com.saneza.api.dao;

import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 2018/10/18.
 *
 */
@Mapper
public interface EmployeeDao
{
    //for getting employees
    public List<Employee> getEmployees(EmployeeFilter employeeFilter);
    //for ge one employee
    public Employee getEmployee(EmployeeFilter  employeeFilter);
    //for counting
    public int countAll(EmployeeFilter employeeFilter);
    //inserting new employee
    public int createEmployee(EmployeeForm employeeForm);
    //for deleting the employee
    //public void deleteEmployee(EmployeeFilter employeeFilter);
}
