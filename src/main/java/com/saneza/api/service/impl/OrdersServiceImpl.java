package com.saneza.api.service.impl;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.dao.OrdersDao;
import com.saneza.api.dao.ProductDao;
import com.saneza.api.helper.OrderProductUpdate;
import com.saneza.api.model.FormFilters.OrdersFilter;
import com.saneza.api.model.FormFilters.OrdersForm;
import com.saneza.api.model.Orders;
import com.saneza.api.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;
   //for update product
    @Autowired
    private ProductDao productDao;

    private OrderProductUpdate orderProductUpdate;

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

    /**
     *
     * @param ordersForm
     * @return
     * for inserting new order.
     */
    @Override
    public String insertOrder(OrdersForm ordersForm) {
      int result=0;
        ordersForm.deliverdStrTodeliverdDate();
        ordersForm.setDate(new Date());

        System.err.println("==========the time is"+ordersForm.getTime());
        result=ordersDao.insertOrders(ordersForm);



        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else {
            return ReturnUtil.resultSuccess("fail to save it");
        }
    }

    /**
     * it means if we update delivered time it is accepted and update the quantiy in product
     * @param  ordersForm
     * @return
     */
    @Override
    public String updateDelivelerdTime(OrdersForm ordersForm) {

        int result=0;

        orderProductUpdate=new OrderProductUpdate();

        orderProductUpdate.setOrderId(ordersForm.getOrderId());
        orderProductUpdate.setUpdateTime(new Date());
        result=ordersDao.updateResponseTime(orderProductUpdate);

        orderProductUpdate.setOrderQuantity(ordersForm.getQuantity());
        orderProductUpdate.setProductId(ordersForm.getProductId());
        productDao.updateQuantityFromOrders(orderProductUpdate);

        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else {
            return ReturnUtil.resultSuccess("fail to save it");
        }

    }

    @Override
    public String updateOrder(OrdersForm ordersForm) {

        orderProductUpdate=new OrderProductUpdate();
        int result=0;
    orderProductUpdate.setOrderId(ordersForm.getOrderId());
    orderProductUpdate.setProductId(ordersForm.getProductId());
    orderProductUpdate.setQuantity(ordersForm.getQuantity());

    result=ordersDao.updateProducts(orderProductUpdate);

        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else {
            return ReturnUtil.resultSuccess("fail to save it");
        }
    }
}
