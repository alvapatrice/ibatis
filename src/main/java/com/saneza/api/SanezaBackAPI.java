package com.saneza.api;
/*
 The main method for our springboot project,
 this is where the project will start
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.saneza.api.dao")
@SpringBootApplication
public class SanezaBackAPI {
    public static void main(String[] args){
        //Spring boot doesn't need to run on the server, it uses it's built in server
        // from this main it will do all the remaining things

        SpringApplication.run(SanezaBackAPI.class,args);
    }
}
