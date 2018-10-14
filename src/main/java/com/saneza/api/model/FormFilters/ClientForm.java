package com.saneza.api.model.FormFilters;

import com.saneza.api.model.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */
public class ClientForm extends Client {

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
            if(this.getBirthday()!=null){

                this.setBirthday(sf.parse(this.birthdayStr));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
