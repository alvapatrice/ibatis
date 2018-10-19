package com.saneza.api.model.FormFilters;


/**
 * Created by gatete rugamba
 * on 10/19/2018
 */
public class BrandFilter extends SearchForm {
    //this is the primary key
    private Integer brandId;
    //	the name of the brand
    private String name;

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
