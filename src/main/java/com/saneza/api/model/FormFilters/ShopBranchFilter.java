package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/17/2018
*/
public class ShopBranchFilter extends SearchForm
{
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
}
