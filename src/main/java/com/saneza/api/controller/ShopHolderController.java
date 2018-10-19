package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.FormFilters.ShopHolderFilter;
import com.saneza.api.model.FormFilters.ShopHolderForm;
import com.saneza.api.model.ShopHolder;
import com.saneza.api.service.ShopHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.OverridesAttribute;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ gatete Rugamba
 * kuwa 19/10/2018
 */
@RestController
@RequestMapping("sh")
public class ShopHolderController {

    @Autowired
    private ShopHolderService shopHolderService;
    @PostMapping("/all.sh")
    private String getShopHolders(ShopHolderFilter shopHolderFilter){
        Map<String,Object> resultMap=new HashMap<>();
        List<ShopHolder> shopHolders=shopHolderService.getShopHolders(shopHolderFilter);
        resultMap.put("data",shopHolders);
        resultMap.put("toatalHolders",shopHolderService.countAll(shopHolderFilter));
        resultMap.put("page",shopHolderFilter.getPage());
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("/one.sh")
    private String getShopHolder(ShopHolderFilter shopHolderFilter){
        Map<String,Object> resultMap=new HashMap<>();
        ShopHolder shopHolder=shopHolderService.getShopHolder(shopHolderFilter);
        resultMap.put("data",shopHolder);
        return ReturnUtil.resultSuccess(resultMap);
    }
    @PostMapping("insert.sh")
    private String insertShopHolder(ShopHolderForm shopHolderForm){
        shopHolderService.insertShopHolder(shopHolderForm);
        return "done";
    }
}
