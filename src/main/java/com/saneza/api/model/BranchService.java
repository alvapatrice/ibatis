package com.saneza.api.model;

import java.util.Date;

/**
 * Created by gatete rugamba
 * on 10/19/2018
 * iyi ni table ihuza shop_branches na service kuko harimo many to many
 */
public class BranchService {
//the id
    private Integer id;
//barnch that derivers the service
    private Integer branchId;
    //the service that is being provided
    private Integer serviceId;
    //the time
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
