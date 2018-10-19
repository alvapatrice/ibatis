package com.saneza.api.service;

import com.saneza.api.model.BranchService;
import com.saneza.api.model.FormFilters.BranchServiceFilter;
import com.saneza.api.model.FormFilters.BranchServiceForm;

import java.util.List;

public interface BranchServiceService
{
    //get list of branches_service
    public List<BranchService> getAll(BranchServiceFilter branchServiceFilter);
    //get branch_service
    public BranchService getBranchService(BranchServiceFilter branchServiceFilter);
    //count
    public int countAll(BranchServiceFilter branchServiceFilter);
    //for inserting data in it
    public void insert(BranchServiceForm branchServiceForm);
}
