package com.HotelBooking.Entity;

public class Bill {
    private Integer sumOfmoney;


    public Bill(Integer sumOfmoney){
        this.sumOfmoney = sumOfmoney;
    }

    /*
    Getter and Setter
     */

    public Integer getSumOfmoney() {
        return sumOfmoney;
    }

    public void setSumOfmoney(Integer sumOfmoney) {
        this.sumOfmoney = sumOfmoney;
    }
}
