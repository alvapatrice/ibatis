package com.saneza.api.dao;

import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import com.saneza.api.model.FormFilters.SupplierFilter;
import com.saneza.api.model.FormFilters.SupplierForm;
import com.saneza.api.model.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 2018/10/18.
 *
 */
@Mapper
public interface SupplierDao
{
    //for getting employees
    public List<Supplier> getSuppliers(SupplierFilter SupplierFilter);
    //for ge one employee
    public Supplier getSupplier(SupplierFilter SupplierFilter);
    //for counting
    public int countAll(SupplierFilter SupplierFilter);
    //inserting new employee
    public void createSupplier(SupplierForm SupplierForm);
    //for deleting the employee
    //public void deleteEmployee(EmployeeFilter employeeFilter);
}
