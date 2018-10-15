package com.saneza.api.dao;
/**
 * Created by Nostalgie
 * on 2018/10/14.
 *
 Test class data access object
 For mybatis it is a mapper class
 */

import com.saneza.api.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {

    //select all tests
    public List<Test> findAll();
}
