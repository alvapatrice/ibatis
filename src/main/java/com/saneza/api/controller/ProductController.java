package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.helper.ProductHelper;
import com.saneza.api.model.Client;
import com.saneza.api.model.FormFilters.ClientFilter;
import com.saneza.api.model.FormFilters.ClientForm;
import com.saneza.api.model.FormFilters.ProductFilter;
import com.saneza.api.model.FormFilters.ProductForm;
import com.saneza.api.model.Product;
import com.saneza.api.service.ClientService;
import com.saneza.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gatete
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService ps;

    //for get the list of all products
    @PostMapping("/getList.do")
    public String getProductList(ProductFilter pf) {
        Map<String, Object> resultmap = new HashMap<>();

        List<Product> products = ps.getProducts(pf);
        resultmap.put("data", products);
        resultmap.put("totalaccount", ps.countAll(pf));
        resultmap.put("page", pf.getPage());

        return ReturnUtil.resultSuccess(resultmap);
    }


    //for get product information
    @PostMapping("/getinfo")
    public String getProduct(ProductFilter pf) {
        Map<String, Object> resultmap = new HashMap<>();
        Product product = ps.getProduct(pf);
        resultmap.put("data", product);
        return ReturnUtil.resultSuccess(resultmap);
    }

    @PostMapping("/insert")
    public String createProduct(ProductForm pf){
        ps.createProduct(pf);
        return "suscefull";
    }

    @PostMapping("/branch.pd")
    public String getBranchProducts(ProductFilter productFilter){
        Map<String, Object> resultmap = new HashMap<>();
        List<ProductHelper> products = ps.getDetaills(productFilter);
        resultmap.put("data", products);
        return ReturnUtil.resultSuccess(resultmap);
    }



}
