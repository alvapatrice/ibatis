package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/19/2018
 */
public class AppoitementFilter extends SearchForm
{
    //unique identification
    private Integer appoitementId;
    //client who asked for the appointment
    private Integer clientId;
    //the service that is requested
    private Integer serviceId;
    private Integer branchId;

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

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}
