package com.saneza.api.service;

import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;

import java.util.List;
/**
 *created by gatete
 * on 10/18/2018
 */
public interface EmployeeService
{
    //get employees
    public List<Employee> getEmployees(EmployeeFilter employeeFilter);
    //get one employee
    public Employee getEmployee(EmployeeFilter employeeFilter);
    //count all
    public int countAll(EmployeeFilter employeeFilter);

    public void createEmployee(EmployeeForm employeeForm);
}
