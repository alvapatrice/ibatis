package com.saneza.api.dao;


import com.saneza.api.model.BranchService;
import com.saneza.api.model.FormFilters.BranchServiceFilter;
import com.saneza.api.model.FormFilters.BranchServiceForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 10/19/2018
 * iyi ni table ihuza shop_branches na service kuko harimo many to many
 */
@Mapper
public interface BranchServiceDao
{
    //for geting branches_seriveces
    public List<BranchService> getBrancheServices(BranchServiceFilter branchServiceFilter);
    //for branches_Service
    public BranchService getBranchService(BranchServiceFilter branchServiceFilter);
    //public count
    public int countAll(BranchServiceFilter branchServiceFilter);
    //for saving
    public void insertBS(BranchServiceForm branchServiceForm);


}
