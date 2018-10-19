package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.ServiceFilter;
import com.saneza.api.model.FormFilters.ServiceForm;
import com.saneza.api.model.Service;
import com.saneza.api.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ServiceController
{
    @Autowired
    private ServiceService serviceService;

    @RequestMapping("/services.sv")
    public String getServices(ServiceFilter serviceFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<Service> services=serviceService.getServices(serviceFilter);
        resultMap.put("data",services);
        resultMap.put("totalaccount",serviceService.countAll(serviceFilter));
        resultMap.put("page",serviceFilter.getPage());
    return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/service.sv")
    public String getService(ServiceFilter serviceFilter){
        Map<String,Object> resultMap=new HashMap<>();
        Service service=serviceService.getService(serviceFilter);
        resultMap.put("data",service);
        return ReturnUtil.resultSuccess(resultMap);
    }

    @PostMapping("/create.sv")
    public String createService(ServiceForm serviceForm){
        serviceService.createService(serviceForm);
        return "succefull";
    }
    @PostMapping("/delete.sv")
    public String deleteService(ServiceFilter serviceFilter){
        serviceService.deleteService(serviceFilter);
        return "done";
    }
}
