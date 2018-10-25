package com.saneza.api.helper;

import java.util.Date;

/**
 * @gatete rugamba
 * on 24/10/2018
 * is for updating product quantity and order
 */
public class OrderProductUpdate
{
    //for order quantity
    private Integer orderQuantity;
//for product id
    private Integer productId;
//it is the order id
    private Integer orderId;
//when it is derivered they update that  time
    private Date updateTime;

    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
