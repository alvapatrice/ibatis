package com.saneza.api.dao;

import com.saneza.api.helper.OrderProductUpdate;
import com.saneza.api.model.FormFilters.OrdersFilter;
import com.saneza.api.model.FormFilters.OrdersForm;
import com.saneza.api.model.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 10/18/2018
 */
@Mapper
public interface OrdersDao
{//for get orders
    public List<Orders> getOrders(OrdersFilter ordersFilter);
    //get orders
    public Orders getOrder(OrdersFilter ordersFilter);
    //for counting all
    public int countAll(OrdersFilter ordersFilter);
    //for inserting an order
    public int insertOrders(OrdersForm ordersForm);
//for upadating the response time
    public int updateResponseTime(OrderProductUpdate orderProductUpdate);

}
