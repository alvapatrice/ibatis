package com.saneza.api.service.impl;

import com.saneza.api.dao.OrdersDao;
import com.saneza.api.model.FormFilters.OrdersFilter;
import com.saneza.api.model.FormFilters.OrdersForm;
import com.saneza.api.model.Orders;
import com.saneza.api.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;


    @Override
    public List<Orders> getOrders(OrdersFilter ordersFilter) {
        ordersFilter.setPaginationDates();
        ordersFilter.setPaginationOffset();
        return ordersDao.getOrders(ordersFilter);
    }

    @Override
    public Orders getOrder(OrdersFilter ordersFilter) {
        return ordersDao.getOrder(ordersFilter);
    }

    @Override
    public int countAll(OrdersFilter ordersFilter) {
        return ordersDao.countAll(ordersFilter);
    }

    @Override
    public void insertOrder(OrdersForm ordersForm) {
      ordersDao.insertOrders(ordersForm);
    }
}
