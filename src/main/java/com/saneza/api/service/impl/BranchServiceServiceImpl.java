package com.saneza.api.service.impl;

import com.saneza.api.dao.BranchServiceDao;
import com.saneza.api.model.BranchService;
import com.saneza.api.model.FormFilters.BranchServiceFilter;
import com.saneza.api.model.FormFilters.BranchServiceForm;
import com.saneza.api.service.BranchServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@Service
public class BranchServiceServiceImpl implements BranchServiceService {
    @Autowired
    private BranchServiceDao branchServiceDao;

    @Override
    public List<BranchService> getAll(BranchServiceFilter branchServiceFilter) {
     branchServiceFilter.setPaginationDates();
     branchServiceFilter.setPaginationOffset();
        return branchServiceDao.getBrancheServices(branchServiceFilter);
    }

    @Override
    public BranchService getBranchService(BranchServiceFilter branchServiceFilter) {
        return branchServiceDao.getBranchService(branchServiceFilter);
    }

    @Override
    public int countAll(BranchServiceFilter branchServiceFilter) {
        return branchServiceDao.countAll(branchServiceFilter);
    }

    @Override
    public void insert(BranchServiceForm branchServiceForm) {

        branchServiceDao.insertBS(branchServiceForm);
    }
}
