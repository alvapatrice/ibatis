package com.saneza.api.service.impl;

import com.saneza.api.dao.EmployeeDao;
import com.saneza.api.dao.SupplierDao;
import com.saneza.api.model.Employee;
import com.saneza.api.model.FormFilters.EmployeeFilter;
import com.saneza.api.model.FormFilters.EmployeeForm;
import com.saneza.api.model.FormFilters.SupplierFilter;
import com.saneza.api.model.FormFilters.SupplierForm;
import com.saneza.api.model.Supplier;
import com.saneza.api.service.EmployeeService;
import com.saneza.api.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *created by gatete rugamba
 * on 10/18/2018
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDao supplierDao;


    @Override
    public List<Supplier> getSuppliers(SupplierFilter supplierFilter) {
        supplierFilter.setPaginationDates();
        supplierFilter.setPaginationOffset();
        return supplierDao.getSuppliers(supplierFilter);
    }

    @Override
    public Supplier getSupplier(SupplierFilter supplierFilter) {
        return supplierDao.getSupplier(supplierFilter);
    }

    @Override
    public int countAll(SupplierFilter supplierFilter) {
        return supplierDao.countAll(supplierFilter);
    }

    @Override
    public void createSupplier(SupplierForm supplierForm) {

        supplierDao.createSupplier(supplierForm);
    }
}
