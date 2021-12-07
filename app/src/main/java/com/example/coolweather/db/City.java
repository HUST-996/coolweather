package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceid;

    public int getId(){
        return id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }
}
