package com.saneza.api.dao;

import com.saneza.api.model.FormFilters.LocationFilter;
import com.saneza.api.model.Location;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gatete rugamba
 * on 2018/10/17.
 *
 */
@Mapper
public interface LocationDao {
//for knowing all locations
    public List<Location> getLocations(LocationFilter locationFilter);
//getting a single location
    public Location getLocation(LocationFilter locationFilter);
//for counting
    public int countAll(LocationFilter locationFilter);

}
