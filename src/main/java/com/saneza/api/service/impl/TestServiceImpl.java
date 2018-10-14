package com.saneza.api.service.impl;


/**
 * Created by Nostalgie
 * on 2018/10/14.
 */
import com.saneza.api.dao.TestDao;
import com.saneza.api.model.Test;
import com.saneza.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 Test service implementation
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    //Query all tests
    @Override
    public List<Test> getAllTest() {
        return testDao.findAll();
    }
}
