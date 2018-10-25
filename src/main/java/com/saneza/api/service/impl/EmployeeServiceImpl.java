package com.saneza.api.service.impl;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.dao.EmployeeDao;
import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import com.saneza.api.service.EmployeeService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
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
    public String createEmployee(EmployeeForm employeeForm) {
        int result=0;
        employeeForm.birthdayStrToBirthdayDate();
        result=employeeDao.createEmployee(employeeForm);

        if(result>0){
            return ReturnUtil.resultSuccess();
        }else {
            return ReturnUtil.resultFail("Database insertion failure");
        }
    }
}
