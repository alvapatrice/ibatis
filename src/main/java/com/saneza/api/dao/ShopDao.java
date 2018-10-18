package com.saneza.api.dao;

import com.saneza.api.model.FormFilters.ShopFilter;
import com.saneza.api.model.FormFilters.ShopForm;
import com.saneza.api.model.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * Created by gatete
 * on 2018/10/17.
 *
 Product class data access object
 For mybatis it is a mapper class
 */

@Mapper
public interface ShopDao
{
    //find all shops
    public List<Shop> findAllShops(ShopFilter shopFilter);

    //find the shop
    public Shop findShop(ShopFilter shopFilter);
    //count
    public int countAll(ShopFilter shopFilter);
    //for creating the shop
    public void createShop(ShopForm shopForm);
}
