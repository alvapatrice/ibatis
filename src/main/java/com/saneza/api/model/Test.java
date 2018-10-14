package com.saneza.api.model;
/**
 * Created by Nostalgie
 * on 2018/10/14.
 */

/*
 Test class for environment setup
 */
public class Test {

    //test id
    private Integer id;

    //test title
    private String testTitle;

    //test content
    private String testContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }
}
