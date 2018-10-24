package com.saneza.api.model;

import java.util.Date;

/**
 * Created by gatete rugamba
 * on 10/18/2018
 *
 */
public class Orders
{
//the id
    private Integer orderId;
//the client that is making the order
    private Integer clientId;
//the product that is being commanded
    private Integer productId;
//	the branch that will deriver the product
    private Integer branchId;
//the total price of that orderp'
    private Integer total;
//the numbers of those products
    private Integer quantity;

//when the order was made
    private Date date;
//when it is derivered
    private Date time;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
