package com.saneza.api.service;
/**
 * @gatete Rugamba
 * kuwa 18/10/2018
 */


import com.saneza.api.helper.ServiceHelper;
import com.saneza.api.model.FormFilters.ServiceFilter;
import com.saneza.api.model.FormFilters.ServiceForm;
import com.saneza.api.model.Service;

import java.util.List;


public interface ServiceService
{//get services
    public List<Service> getServices(ServiceFilter serviceFilter);
   //get specific service
    public Service getService(ServiceFilter serviceFilter);
    //for counting
    public int countAll(ServiceFilter serviceFilter);
    //for creating srevices
    public String createService(ServiceForm serviceForm);
    //for deleting service
    public void deleteService(ServiceFilter serviceFilter);
//for geting services of the branch
    public List<ServiceHelper> getSomeServices(ServiceFilter serviceFilter);
}
