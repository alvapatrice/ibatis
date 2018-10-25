package com.saneza.api.model.FormFilters;

import com.saneza.api.model.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by gatete rugamba
 * on 10/18/2018
 */
public class EmployeeForm extends Employee
{
    private String birthdayStr;

    public String getBirthdayStr() {
        return birthdayStr;
    }

    public void setBirthdayStr(String birthdayStr) {
        this.birthdayStr = birthdayStr;
    }

    public void  birthdayStrToBirthdayDate(){
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            if(this.getBirthDay()!=null){

                this.setBirthDay(sf.parse(this.birthdayStr));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
