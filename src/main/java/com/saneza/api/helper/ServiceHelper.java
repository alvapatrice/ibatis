package com.saneza.api.helper;

/**
 * @gatete rugamba
 * kuwa 22/10/2018
 */
public class ServiceHelper
{
    //the name of the service
    private String serviceName;
//the duration it takes
    private String duration;
//the pice of the service
    private Integer price;
//category name
    private String name;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
