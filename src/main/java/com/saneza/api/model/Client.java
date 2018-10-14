package com.saneza.api.model;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Date;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */
public class Client {
    // client id user id, primary key
    private Integer clientId;

    //location id(province, district, sector, cell)
    private Integer locationId;

    //street name
    private String streetName;

    //user phone number
    private String phoneNumber;

    //username(unique 10 character string)
    private String username;

    //user first name
    private String firstName;

    //user last name
    private String lastName;

    //user birthday
    private Date birthday;

    //0-not defined, 1-male, 2-female
    private Integer sex;

    //user password(encrypted)
    private String password;

    //user email address
    private String email;

    //user profile image
    private String profileImage;

    //user credits
    private Integer credit;

    //user created time
    private Date createTime;

    //User last updated time
    private Date updateTime;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
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
