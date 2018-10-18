package com.saneza.api.service;



import com.saneza.api.model.FormFilters.ServiceFilter;
import com.saneza.api.model.Service;

import java.util.List;


public interface ServiceService
{//get services
    public List<Service> getServices(ServiceFilter serviceFilter);
   //get specific service
    public Service getService(ServiceFilter serviceFilter);
    //for counting
    public int countAll(ServiceFilter serviceFilter);
}
