package com.saneza.api.service.impl;
/**
 * @gatete rugamba
 * kuwa 19/10/2018
 */

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.dao.ServiceDao;
import com.saneza.api.helper.ServiceHelper;
import com.saneza.api.model.FormFilters.ServiceFilter;
import com.saneza.api.model.FormFilters.ServiceForm;
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

    @Override
    public String createService(ServiceForm serviceForm) {
        int result=0;

        result=serviceDao.createService(serviceForm);
        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else{
            return ReturnUtil.resultSuccess("failed to insert");
        }
    }

    @Override
    public void deleteService(ServiceFilter serviceFilter) {
        serviceDao.deleteService(serviceFilter);
    }

    @Override
    public List<ServiceHelper> getSomeServices(ServiceFilter serviceFilter) {
        return serviceDao.getIt(serviceFilter.getBranchId());
    }
}
