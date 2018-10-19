package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.ShopFilter;
import com.saneza.api.model.FormFilters.ShopForm;
import com.saneza.api.model.Shop;
import com.saneza.api.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *created by gatete rugamba
 * on 10/19/2018
 */
@RestController
@RequestMapping("/shop")
public class ShopController
{
    @Autowired
    private ShopService shopService;

    //for get list of shops
    @PostMapping("/getlist.sp")
    public String getShopList(ShopFilter shopFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<Shop> shops=shopService.getShops(shopFilter);
         resultMap.put("data",shops);
         resultMap.put("totalaccount",shopService.countAll(shopFilter));
         resultMap.put("page",shopFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/getshop.sp")
    public String getShop(ShopFilter shopFilter){
        Map<String,Object> resultMAp=new HashMap<>();
        Shop shop=shopService.getShop(shopFilter);
        resultMAp.put("data",shop);
        return ReturnUtil.resultSuccess(resultMAp);
    }
    @PostMapping("/create.sp")
    public String createShop(ShopForm shopForm){
        shopService.creteShop(shopForm);
        return "suscefully";
    }
}
