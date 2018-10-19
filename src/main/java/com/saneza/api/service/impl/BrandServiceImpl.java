package com.saneza.api.service.impl;

import com.saneza.api.dao.BrandDao;
import com.saneza.api.model.Brand;
import com.saneza.api.model.FormFilters.BrandFilter;
import com.saneza.api.model.FormFilters.BrandForm;
import com.saneza.api.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;

    @Override
    public List<Brand> getBrands(BrandFilter brandFilter) {
        brandFilter.setPaginationDates();
        brandFilter.setPaginationOffset();
        return brandDao.getBrands(brandFilter);
    }

    @Override
    public Brand getBrand(BrandFilter brandFilter) {
        return brandDao.getBrand(brandFilter);
    }

    @Override
    public int countAll(BrandFilter brandFilter) {
        return brandDao.countAll(brandFilter);
    }

    @Override
    public void insertBrand(BrandForm brandForm) {
      brandDao.insertBrand(brandForm);
    }
}
