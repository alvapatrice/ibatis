package com.saneza.api.service;

import com.saneza.api.model.FormFilters.ShopServicesFilter;
import com.saneza.api.model.FormFilters.ShopServicesForm;
import com.saneza.api.model.ShopServices;

import java.util.List;

/**
 * @ gatete rugamba
 * kuwa 19/10/2018
 */
public interface ShopServicesService {
    //for creating services
    public List<ShopServices> getShopServices(ShopServicesFilter shopServicesFilter);

    public ShopServices getShopService(ShopServicesFilter shopServicesFilter);

    public int countAll(ShopServicesFilter shopServicesFilter);

    public void save(ShopServicesForm shopServicesForm);

}
