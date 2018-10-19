package com.saneza.api.service.impl;

import com.saneza.api.dao.ShopHolderDao;
import com.saneza.api.model.FormFilters.ShopHolderFilter;
import com.saneza.api.model.FormFilters.ShopHolderForm;
import com.saneza.api.model.ShopHolder;
import com.saneza.api.service.ShopHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ gatete Rugamba
 * kuwa 19/10/2018
 */
@Service
public class ShopHolderImpl implements ShopHolderService
{
    @Autowired
    private ShopHolderDao shopHolderDao;

    @Override
    public List<ShopHolder> getShopHolders(ShopHolderFilter shopHolderFilter) {
        shopHolderFilter.setPaginationDates();
        shopHolderFilter.setPaginationOffset();
        return shopHolderDao.getShopHolders(shopHolderFilter);
    }

    @Override
    public ShopHolder getShopHolder(ShopHolderFilter shopHolderFilter) {
        return shopHolderDao.getShopHolder(shopHolderFilter);
    }

    @Override
    public int countAll(ShopHolderFilter shopHolderFilter) {
        return shopHolderDao.countAll(shopHolderFilter);
    }

    @Override
    public void insertShopHolder(ShopHolderForm shopHolderForm) {
        shopHolderDao.insertShopHolder(shopHolderForm);
    }
}
