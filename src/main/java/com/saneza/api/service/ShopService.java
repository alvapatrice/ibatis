package com.saneza.api.service;
/*
*created by gatete
* on 10/16/2018
 */


import com.saneza.api.model.FormFilters.ShopFilter;
import com.saneza.api.model.FormFilters.ShopForm;
import com.saneza.api.model.Shop;

import java.util.List;

public interface ShopService {
    //get shops
    public List<Shop> getShops(ShopFilter shopFilter);
    //get shop
    public Shop getShop(ShopFilter shopFilter);
    //for counting
    public int countAll(ShopFilter shopFilter);
//for creating shops
    public void creteShop(ShopForm shopForm);
}
