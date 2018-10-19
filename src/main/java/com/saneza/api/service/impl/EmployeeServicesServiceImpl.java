package com.saneza.api.service.impl;

import com.saneza.api.dao.EmployeeServicesDao;
import com.saneza.api.model.EmployeeServices;
import com.saneza.api.model.FormFilters.EmployeeServicesFilter;
import com.saneza.api.model.FormFilters.EmployeeServicesForm;
import com.saneza.api.service.EmployeeServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *created by gatete rugamba
 * on 10/19/2018
 * this service is for @joinTable for employees and services
 */
@Service
public class EmployeeServicesServiceImpl implements EmployeeServicesService {

    @Autowired
    private EmployeeServicesDao employeeServicesDao;

    @Override
    public List<EmployeeServices> getEmployeeServicess(EmployeeServicesFilter employeeServicesFilter) {
       employeeServicesFilter.setPaginationDates();
       employeeServicesFilter.setPaginationOffset();
        return employeeServicesDao.getAllEmployeeServices(employeeServicesFilter);
    }

    @Override
    public EmployeeServices getEmployeeServices(EmployeeServicesFilter employeeServicesFilter) {
        return employeeServicesDao.getEmployeeServices(employeeServicesFilter);
    }

    @Override
    public int countAll(EmployeeServicesFilter employeeServicesFilter) {
        return employeeServicesDao.countAll(employeeServicesFilter);
    }

    @Override
    public void insertEmployeeServices(EmployeeServicesForm employeeServicesForm) {

        employeeServicesDao.insertEmployeeServices(employeeServicesForm);
    }
}
