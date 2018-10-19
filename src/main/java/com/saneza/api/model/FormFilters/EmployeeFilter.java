package com.saneza.api.model.FormFilters;
/**
 * Created by gatete rugamba
 * on 10/18/2018
 */
public class EmployeeFilter extends SearchForm
{

    //the id
    private Integer employeeId;
    //for location
    private Integer locationId;
    //the name of the street
    private String streetName;
    //the phone_number
    private String phoneNumber;
    //for the name he will use
    private String userName;
    //the first name
    private String firstName;
    //for the second name
    private String lastName;
    //for email
    private String email;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
