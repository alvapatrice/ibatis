package com.saneza.api.service.impl;

import com.saneza.api.dao.ProductDao;
import com.saneza.api.helper.ProductHelper;
import com.saneza.api.model.FormFilters.ProductFilter;
import com.saneza.api.model.FormFilters.ProductForm;
import com.saneza.api.model.Product;
import com.saneza.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductDao pdao;

@Override
    public List<Product> getProducts(ProductFilter pf){
    pf.setPaginationDates();
    pf.setPaginationOffset();
    return pdao.findAllProduct(pf);
}
@Override
    public Product getProduct(ProductFilter pf){
        return pdao.findProduct(pf);
}

    @Override
    public int countAll(ProductFilter productFilter) {

        return pdao.count(productFilter);
    }

    @Override
    public void createProduct(ProductForm productForm) {
        pdao.createProduct(productForm);
    }

    @Override
    public List<ProductHelper> getDetaills(ProductFilter productFilter) {
        return pdao.getDetails(productFilter.getBranchId());
    }

}
