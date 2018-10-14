package com.saneza.api.service;

/**
 * Created by Nostalgie
 * on 2018/10/14.
 */

import com.saneza.api.model.Test;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 Test service interface
 */
@Service
public interface TestService {
    public List<Test> getAllTest();
}
