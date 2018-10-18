package com.saneza.api.dao;
/**
 * Created by gatete
 * on 2018/10/16.
 *
 Product class data access object
 For mybatis it is a mapper class
 */

import com.saneza.api.model.FormFilters.ProductFilter;
import com.saneza.api.model.FormFilters.ProductForm;
import com.saneza.api.model.Product;
import com.saneza.api.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDao {

    //get all products
    public List<Product> findAllProduct(ProductFilter pf);
    //get one product
    public  Product findProduct(ProductFilter pf);
    //for creating new product and save it
    public void createProduct(ProductForm productForm);
    //for updating the product
    public int updateProduct(ProductForm productForm);
    //counting pagination
    public int count(ProductFilter pf);
}
