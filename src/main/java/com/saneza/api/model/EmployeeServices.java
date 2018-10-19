package com.saneza.api.model;

import java.util.Date;

/**
 * Created by gatete rugamba
 * on 10/19/2018
 *this is the @joinTable of services and employees
 */
public class EmployeeServices
{
    private Integer id;
    //employee that gives the service
    private Integer employeeId;
//	service that is assigned to employee
    private Integer serviceId;
//CURRENT_TIMESTAMP
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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
