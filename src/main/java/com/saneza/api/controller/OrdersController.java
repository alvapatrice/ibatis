package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.OrdersFilter;
import com.saneza.api.model.FormFilters.OrdersForm;
import com.saneza.api.model.Orders;
import com.saneza.api.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@RestController
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping("/orders.od")
    public String getOrders(OrdersFilter ordersFilter) {
        Map<String, Object> resultMap = new HashMap<>();
        List<Orders> orders = ordersService.getOrders(ordersFilter);
        resultMap.put("data", orders);
        resultMap.put("tatalorders", ordersService.countAll(ordersFilter));
        resultMap.put("page", ordersFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }

    @PostMapping("/order.od")
    public String getOrder(OrdersFilter ordersFilter) {
        Map<String, Object> resultMap = new HashMap<>();
        Orders orders = ordersService.getOrder(ordersFilter);
        resultMap.put("data", orders);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/insert.od")
    public String insertOrder(OrdersForm ordersForm){
        ordersService.insertOrder(ordersForm);
        return "done";
    }
}