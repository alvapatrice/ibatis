package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/18/2018
 */
public class OrdersFilter extends SearchForm
{
    //the id
    private Integer orderId;
    //the client that is making the order
    private Integer clientId;
    //the product that is being commanded
    private Integer productId;
    //	the branch that will deriver the product
    private Integer branchId;

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
}
