package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/19/2018
 *
 */
public class EmployeeServicesFilter extends SearchForm {
    private Integer id;
    //employee that gives the service
    private Integer employeeId;
    //	service that is assigned to employee
    private Integer serviceId;


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
}