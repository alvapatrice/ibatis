package com.saneza.api.model;

import java.util.Date;
/**
 * Created by gatete rugamba
 * on 10/19/2018
 */
public class Appoitement
{
    //unique identification
    private Integer appoitementId;
//client who asked for the appointment
    private Integer clientId;
//the service that is requested
    private Integer serviceId;
//	time that the appointment was made
    private Date timeCreated;
//time that it will be take the place
    private Date time;
 //	the branch that will serve
    private Integer branchId;
 //   whether it is sent wait or done
    private Integer status;

    public Integer getAppoitementId() {
        return appoitementId;
    }

    public void setAppoitementId(Integer appoitementId) {
        this.appoitementId = appoitementId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
