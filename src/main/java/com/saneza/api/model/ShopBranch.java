package com.saneza.api.model;

import java.util.Date;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */
public class ShopBranch {

    //branch Id
    private Integer branchId;

    //shop id
    private Integer shopId;

    //location id(Containing province, district, sector, cell)
    private Integer locationId;

    //shop street name
    private String streetName;

    //branch name
    private String branchName;

    //location latitude
    private Double latitude;

    //location longitude
    private Double longitude;

    // opening time like 7:00
    private Date openFrom;

    // closing time like 17:00
    private Date closeAt;

    //opening days like (1,2,3,4,5,6,7,) represent Monday to Sunday
    private String openDays;

    //branch status 1-available, 0-closed, -99 closed
    private Integer status;

    //create time
    private Date createTime;

    //update time
    private Date updateTime;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Date getOpenFrom() {
        return openFrom;
    }

    public void setOpenFrom(Date openFrom) {
        this.openFrom = openFrom;
    }

    public Date getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(Date closeAt) {
        this.closeAt = closeAt;
    }

    public String getOpenDays() {
        return openDays;
    }

    public void setOpenDays(String openDays) {
        this.openDays = openDays;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
