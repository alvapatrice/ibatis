package com.saneza.api.service;

import com.saneza.api.model.Brand;
import com.saneza.api.model.FormFilters.BrandFilter;
import com.saneza.api.model.FormFilters.BrandForm;

import java.util.List;

/**
 *created by gatete rugamba
 * on 10/19/2018
 */
public interface BrandService
{
    //for geting brands
    public List<Brand> getBrands(BrandFilter brandFilter);
    //for get brand
    public Brand getBrand(BrandFilter brandFilter);
    //for counting it
    public int countAll(BrandFilter brandFilter);
//for inserting new brand
    public void insertBrand(BrandForm brandForm);
}
