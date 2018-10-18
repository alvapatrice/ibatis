package com.saneza.api.service;

import com.saneza.api.dao.ShopBranchDao;
import com.saneza.api.model.FormFilters.ShopBranchFilter;
import com.saneza.api.model.ShopBranch;

import java.util.List;

public interface ShopBranchService
{
//get all list of the branches
    public List<ShopBranch> getBranches(ShopBranchFilter shopBranchFilter);
    //get a single branch
    public ShopBranch getBranch(ShopBranchFilter shopBranchFilter);
    //count all
    public int count(ShopBranchFilter shopBranchFilter);

}
