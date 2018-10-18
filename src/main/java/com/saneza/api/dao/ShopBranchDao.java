package com.saneza.api.dao;

import com.saneza.api.model.FormFilters.ShopBranchFilter;
import com.saneza.api.model.ShopBranch;

import java.util.List;
/**
 * Created by gatete rugamba
 * on 10/17/2018
 */
public interface ShopBranchDao
{
//get all shop branch
    public List<ShopBranch> getShops(ShopBranchFilter shopBranchFilter);
    //get specific shop
    public ShopBranch getShop(ShopBranchFilter shopBranchFilter);
//count all
    public int countAll(ShopBranchFilter shopBranchFilter);
}
