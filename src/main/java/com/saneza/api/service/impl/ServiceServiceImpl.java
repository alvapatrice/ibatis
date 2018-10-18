package com.saneza.api.service.impl;

import com.saneza.api.dao.ServiceDao;
import com.saneza.api.model.FormFilters.ServiceFilter;
import com.saneza.api.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService{
    @Autowired
    private ServiceDao serviceDao;


    @Override
    public List<com.saneza.api.model.Service> getServices(ServiceFilter serviceFilter) {
       serviceFilter.setPaginationDates();
       serviceFilter.setPaginationOffset();
        return serviceDao.getServices(serviceFilter);
    }

    @Override
    public com.saneza.api.model.Service getService(ServiceFilter serviceFilter) {

        return serviceDao.getService(serviceFilter);
    }

    @Override
    public int countAll(ServiceFilter serviceFilter) {
        return serviceDao.countAll(serviceFilter);
    }
}
