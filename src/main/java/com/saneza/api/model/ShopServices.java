package com.saneza.api.model;

import java.util.Date;

/**
 * @gatete rugamba
 * kuwa 19/10/2018
 * this is @joinTable for shop and services
 */
public class ShopServices
{
//the id
    private Integer id;
//the shop_Id
    private Integer shopId;
//the service_id
    private Integer serviceId;
//the date was created on
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
