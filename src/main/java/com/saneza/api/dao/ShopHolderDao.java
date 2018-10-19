package com.saneza.api.dao;

import com.saneza.api.model.FormFilters.ShopHolderFilter;
import com.saneza.api.model.FormFilters.ShopHolderForm;
import com.saneza.api.model.ShopHolder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * gatete rugamba
 * kuwa 19/10/2018
 */
@Mapper
public interface ShopHolderDao
{
    //for geting all
    public List<ShopHolder> getShopHolders(ShopHolderFilter shopHolderFilter);
//get shopholder
    public ShopHolder getShopHolder(ShopHolderFilter shopHolderFilter);
    //counting
    public int countAll(ShopHolderFilter shopHolderFilter);
    //for inserting holder
    public void insertShopHolder(ShopHolderForm shopHolderForm);
}
