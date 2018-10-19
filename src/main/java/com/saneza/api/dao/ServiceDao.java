package com.saneza.api.dao;

import com.saneza.api.model.FormFilters.ServiceFilter;
import com.saneza.api.model.FormFilters.ServiceForm;
import com.saneza.api.model.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 2018/10/17.
 *
 */
@Mapper
public interface ServiceDao
{
//for get services
    public List<Service> getServices(ServiceFilter serviceFilter);
//get a service
    public Service getService(ServiceFilter serviceFilter);
    //count all in
    public int countAll(ServiceFilter serviceFilter);
//for creating services
    public void createService(ServiceForm serviceForm);
//for deleting a service
    public void deleteService(ServiceFilter serviceFilter);
}
