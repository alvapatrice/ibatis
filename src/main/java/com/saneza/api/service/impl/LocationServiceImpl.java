package com.saneza.api.service.impl;

import com.saneza.api.dao.LocationDao;
import com.saneza.api.model.FormFilters.LocationFilter;
import com.saneza.api.model.Location;
import com.saneza.api.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *created by gatete rugamba
 * on 10/17/2018
 */
import java.util.List;
@Service
public class LocationServiceImpl implements LocationService {
   @Autowired
   private LocationDao locationDao;

    @Override
    public List<Location> getLocations(LocationFilter locationFilter) {
        locationFilter.setPaginationDates();
        locationFilter.setPaginationOffset();
        return locationDao.getLocations(locationFilter);
    }

    @Override
    public Location getLocation(LocationFilter locationFilter) {
        return locationDao.getLocation(locationFilter);
    }

    @Override
    public int count(LocationFilter locationFilter) {
        return locationDao.countAll(locationFilter);
    }
}
