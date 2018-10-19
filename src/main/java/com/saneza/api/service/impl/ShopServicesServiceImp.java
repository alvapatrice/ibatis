package com.saneza.api.service.impl;

import com.saneza.api.dao.ShopServicesDao;
import com.saneza.api.model.FormFilters.ShopServicesFilter;
import com.saneza.api.model.FormFilters.ShopServicesForm;
import com.saneza.api.model.ShopServices;
import com.saneza.api.service.ShopServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ gatete rugamba
 * kuwa 19/10/2018
 */
@Service
public class ShopServicesServiceImp implements ShopServicesService {
    @Autowired
    private ShopServicesDao shopServicesDao;

    @Override
    public List<ShopServices> getShopServices(ShopServicesFilter shopServicesFilter) {
        shopServicesFilter.setPaginationDates();
        shopServicesFilter.setPaginationOffset();
        return shopServicesDao.getShopServicess(shopServicesFilter);
    }

    @Override
    public ShopServices getShopService(ShopServicesFilter shopServicesFilter) {
        return shopServicesDao.getShopServices(shopServicesFilter);
    }

    @Override
    public int countAll(ShopServicesFilter shopServicesFilter) {
        return shopServicesDao.countAll(shopServicesFilter);
    }

    @Override
    public void save(ShopServicesForm shopServicesForm) {

        shopServicesDao.insertShopServices(shopServicesForm);
    }
}
