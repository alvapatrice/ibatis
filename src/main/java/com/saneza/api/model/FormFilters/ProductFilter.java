package com.saneza.api.model.FormFilters;
/**
 *created by gatete
 * on 10/16/2018
 */
public class ProductFilter extends SearchForm {

    private Integer productId;

    private String productName;

    //product shop id
    private Integer shopId;

    //product category
    private Integer category;


    //product brand
    private Integer brand;


    private Integer stock;

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }



    public Integer getBrand() {
        return brand;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId){
        this.productId=productId;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
}
