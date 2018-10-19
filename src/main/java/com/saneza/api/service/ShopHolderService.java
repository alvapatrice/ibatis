package com.saneza.api.service;

import com.saneza.api.model.FormFilters.ShopHolderFilter;
import com.saneza.api.model.FormFilters.ShopHolderForm;
import com.saneza.api.model.ShopHolder;

import java.util.List;

/**
 * @ gatete Rugamba
 * kuwa 19/10/2018
 */
public interface ShopHolderService {
    //get shopholders
    public List<ShopHolder> getShopHolders(ShopHolderFilter shopHolderFilter);
    //one
    public ShopHolder getShopHolder(ShopHolderFilter shopHolderFilter);
    //count
    public int countAll(ShopHolderFilter shopHolderFilter);
    //insert
    public void insertShopHolder(ShopHolderForm shopHolderForm);
}
