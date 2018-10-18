package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/17/2018
 */
public class LocationFilter extends SearchForm
{
    private Integer locationId;

    //location province
    private String province;

    //location district
    private String district;

    //location sector
    private String sector;

    //location cell
    private String cell;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
