package com.saneza.api.service.impl;

import com.saneza.api.dao.EmployeeDao;
import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import com.saneza.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *created by gatete rugamba
 * on 10/18/2018
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployees(EmployeeFilter employeeFilter) {
        employeeFilter.setPaginationDates();
        employeeFilter.setPaginationOffset();
        return employeeDao.getEmployees(employeeFilter);
    }

    @Override
    public Employee getEmployee(EmployeeFilter employeeFilter) {
        return employeeDao.getEmployee(employeeFilter);
    }

    @Override
    public int countAll(EmployeeFilter employeeFilter) {
        return employeeDao.countAll(employeeFilter);
    }

    @Override
    public void createEmployee(EmployeeForm employeeForm) {

        employeeDao.createEmployee(employeeForm);
    }
}
