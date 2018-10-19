package com.saneza.api.dao;

import com.saneza.api.model.Brand;
import com.saneza.api.model.FormFilters.BrandFilter;
import com.saneza.api.model.FormFilters.BrandForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 10/19/2018
 */
@Mapper
public interface BrandDao
{
    //for getting brands
    public List<Brand> getBrands(BrandFilter brandFilter);
    //get brand
    public Brand getBrand(BrandFilter brandFilter);
    //for counting
    public int countAll(BrandFilter brandFilter);
    //for insreting brands
    public void insertBrand(BrandForm brandForm);
}
