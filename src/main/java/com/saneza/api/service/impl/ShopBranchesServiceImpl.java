package com.saneza.api.service.impl;

import com.saneza.api.dao.ShopBranchDao;
import com.saneza.api.model.FormFilters.ShopBranchFilter;
import com.saneza.api.model.ShopBranch;
import com.saneza.api.service.ShopBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
*created by gatete
* on 10/17/2018
 */
import java.util.List;
@Service
public class ShopBranchesServiceImpl implements ShopBranchService {
   @Autowired
    private ShopBranchDao shopBranchDao;

    @Override
    public List<ShopBranch> getBranches(ShopBranchFilter shopBranchFilter) {
        shopBranchFilter.setPaginationDates();
        shopBranchFilter.setPaginationOffset();
        return shopBranchDao.getShops(shopBranchFilter);
    }

    @Override
    public ShopBranch getBranch(ShopBranchFilter shopBranchFilter) {
        return shopBranchDao.getShop(shopBranchFilter);
    }

    @Override
    public int count(ShopBranchFilter shopBranchFilter) {
        return shopBranchDao.countAll(shopBranchFilter);
    }
}
