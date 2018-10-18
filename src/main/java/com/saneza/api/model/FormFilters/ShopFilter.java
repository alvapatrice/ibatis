package com.saneza.api.model.FormFilters;
/**
 *created by gatete rugamba
 * on 10/16/2018
 */
public class ShopFilter extends SearchForm{
//by its id
    private Integer shopId;
 //by its name
    private String shopName;
 //by the owner
    private Integer ownerId;
 //by the type of that shop
    private String shopType;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
}
