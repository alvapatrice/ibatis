package com.saneza.api.controller;

/**
 * Created by Nostalgie
 * on 2018/10/14.
 */
import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.Test;
import com.saneza.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;

    //test simple request(Hand shake)
    @PostMapping("/hello")
    public String testJson(){
        Map<String,Object> resultMap= new HashMap<String,Object>();
        resultMap.put("data","Hi");

        return ReturnUtil.resultSuccess(resultMap);
    }

    //test data retrieval with mybatis
    @PostMapping("/mybatis")
    public String testMybatis(){
        Map<String,Object> resultMap= new HashMap<String,Object>();
        List<Test> tests=testService.getAllTest();
        resultMap.put("data",tests);

        return ReturnUtil.resultSuccess(resultMap);
    }
}
