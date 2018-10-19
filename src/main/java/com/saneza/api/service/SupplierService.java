package com.saneza.api.service;

import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import com.saneza.api.model.FormFilters.SupplierFilter;
import com.saneza.api.model.FormFilters.SupplierForm;
import com.saneza.api.model.Supplier;

import java.util.List;

/**
 *created by gatete
 * on 10/18/2018
 */
public interface SupplierService
{
    //get Supplier
    public List<Supplier> getSuppliers(SupplierFilter supplierFilter);
    //get one Supplier
    public Supplier getSupplier(SupplierFilter supplierFilter);
    //count all
    public int countAll(SupplierFilter supplierFilter);

    public void createSupplier(SupplierForm supplierForm);
}
