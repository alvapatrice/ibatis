package com.saneza.api.service.impl;

import com.saneza.api.dao.ShopDao;
import com.saneza.api.model.FormFilters.ShopFilter;
import com.saneza.api.model.FormFilters.ShopForm;
import com.saneza.api.model.Shop;
import com.saneza.api.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
*created by gatete
* on 10/17/2018
 */

@Service
public class ShopServiceImpl implements ShopService
{
    @Autowired
    private ShopDao shopDao;


    @Override
    public List<Shop> getShops(ShopFilter shopFilter) {
        shopFilter.setPaginationDates();
        shopFilter.setPaginationOffset();
        return shopDao.findAllShops(shopFilter);
    }

    @Override
    public Shop getShop(ShopFilter shopFilter) {
        return shopDao.findShop(shopFilter);
    }

    @Override
    public int countAll(ShopFilter shopFilter) {
        return shopDao.countAll(shopFilter);
    }

    @Override
    public void creteShop(ShopForm shopForm) {
        shopDao.createShop(shopForm);
    }
}
