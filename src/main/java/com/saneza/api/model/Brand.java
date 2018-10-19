package com.saneza.api.model;
/**
 * Created by gatete rugamba
 * on 10/19/2018
 */
public class Brand
{
    //this is the primary key
    private Integer brandId;
//	the name of the brand
    private String name;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
