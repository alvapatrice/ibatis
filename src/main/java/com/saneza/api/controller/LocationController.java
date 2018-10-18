package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.LocationFilter;
import com.saneza.api.model.Location;
import com.saneza.api.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *created by gatete rugamba
 * on 10/17/2018
 */
@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @PostMapping("/locations.ls")
    public String getLocations(LocationFilter locationFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<Location> locations=locationService.getLocations(locationFilter);
        resultMap.put("data",locations);
        resultMap.put("time",locationService.count(locationFilter));
        resultMap.put("pages",locationFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/location.l")
    public String getLocation(LocationFilter locationFilter){
        Map<String,Object> resultMap=new HashMap<>();
        Location location=locationService.getLocation(locationFilter);
        resultMap.put("data",location);
        return ReturnUtil.resultSuccess(resultMap);
    }
}
