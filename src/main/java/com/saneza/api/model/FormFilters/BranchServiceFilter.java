package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/19/2018
 */
public class BranchServiceFilter extends SearchForm
{
    //the id
    private Integer id;
    //barnch that derivers the service
    private Integer branchId;
    //the service that is being provided
    private Integer serviceId;

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
}
