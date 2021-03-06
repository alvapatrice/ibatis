package com.saneza.api.service;

import com.saneza.api.helper.OrderProductUpdate;
import com.saneza.api.model.FormFilters.OrdersFilter;
import com.saneza.api.model.FormFilters.OrdersForm;
import com.saneza.api.model.Orders;

import java.util.List;

/**
 *created by gatete
 * on 10/19/2018
 */
public interface OrdersService {
    //get list of orders
    public List<Orders> getOrders(OrdersFilter ordersFilter);
    //get one order
    public Orders getOrder(OrdersFilter ordersFilter);
    //count all
    public int countAll(OrdersFilter ordersFilter);
    //insert new order
    public String insertOrder(OrdersForm ordersForm);
    //it means if we update dleivered time it is accepted
    public String updateDelivelerdTime(OrdersForm ordersForm);
    //for updating products and quantity in the order
    public String updateOrder(OrdersForm ordersForm);
}
