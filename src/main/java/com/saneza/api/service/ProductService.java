package com.saneza.api.service;

import com.saneza.api.helper.ProductHelper;
import com.saneza.api.model.FormFilters.ProductFilter;
import com.saneza.api.model.FormFilters.ProductForm;
import com.saneza.api.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
/*
*created by gatete
* on 10/16/2018
 */


public interface ProductService
{//get many products
    public List<Product> getProducts(ProductFilter pf);
    //get one product
    public Product getProduct(ProductFilter pf);
    //this is for counting all of them
    public int countAll(ProductFilter productFilter);
    //for creating product
    public void createProduct(ProductForm productForm);

    public List<ProductHelper> getDetaills(ProductFilter productFilter);
}
