package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.ShopServicesFilter;
import com.saneza.api.model.FormFilters.ShopServicesForm;
import com.saneza.api.model.ShopServices;
import com.saneza.api.service.ShopServicesService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @gatete rugamba
 * kuwa 19/10/2018
 */
@RestController
@RequestMapping("ss")
public class ShopServiceController {

    @Autowired
    private ShopServicesService shopServicesService;

    @PostMapping("/all.ss")
    public String getShopServicess(ShopServicesFilter shopServicesFilter) {
        Map<String, Object> resultMap = new HashMap<>();
        List<ShopServices> shopServices = shopServicesService.getShopServices(shopServicesFilter);
        resultMap.put("data", shopServices);
        resultMap.put("tatal", shopServicesService.countAll(shopServicesFilter));
        resultMap.put("page", shopServicesFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }

    @PostMapping("/one.ss")
    public String getShopService(ShopServicesFilter shopServicesFilter) {
        Map<String, Object> resultMap = new HashMap<>();
        ShopServices shopServices = shopServicesService.getShopService(shopServicesFilter);
        resultMap.put("data", shopServices);
        return ReturnUtil.resultSuccess(resultMap);

    }
    @PostMapping("insert.ss")
    public String save(ShopServicesForm shopServicesForm){
        shopServicesService.save(shopServicesForm);
        return "done";
    }
}