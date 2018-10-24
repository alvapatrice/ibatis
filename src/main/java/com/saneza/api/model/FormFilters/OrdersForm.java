package com.saneza.api.model.FormFilters;

import com.saneza.api.model.Orders;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gatete rugamba
 * on 10/18/2018
 */
public class OrdersForm extends Orders
{

    private String delivredTime;

    public String getDelivredTime() {
        return delivredTime;
    }

    public void setDelivredTime(String delivredTime) {
        this.delivredTime = delivredTime;
    }
    public void deliverdStrTodeliverdDate(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        if(this.getTime()!=null){
            try {
                this.setTime(simpleDateFormat.parse(this.delivredTime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else {
            this.setTime(new Date());
        }
    }
}
