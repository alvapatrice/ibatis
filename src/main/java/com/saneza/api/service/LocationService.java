package com.saneza.api.service;

import com.saneza.api.model.FormFilters.LocationFilter;
import com.saneza.api.model.Location;

import java.util.List;
/**
 *created by gatete
 * on 10/17/2018
 */
public interface LocationService
{
    //get the list
    public List<Location> getLocations(LocationFilter locationFilter);
    //get the one
    public Location getLocation(LocationFilter locationFilter);
    //get numbers
    public int count(LocationFilter locationFilter);
}
