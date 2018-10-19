package com.saneza.api.dao;

import com.saneza.api.model.FormFilters.ShopServicesFilter;
import com.saneza.api.model.FormFilters.ShopServicesForm;
import com.saneza.api.model.ShopServices;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @gatete rugamba
 * kuwa 19/10/2018
 * this the DAO for is @joinTable for shop and services
 */
@Mapper
public interface ShopServicesDao
{
    //for all
    public List<ShopServices> getShopServicess(ShopServicesFilter shopServicesFilter);
    //get one
    public ShopServices getShopServices(ShopServicesFilter shopServicesFilter);
    //for counting
    public int countAll(ShopServicesFilter shopServicesFilter);
    //for inserting
    public int insertShopServices(ShopServicesForm shopServicesForm);
}
