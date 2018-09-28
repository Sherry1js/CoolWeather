package com.sherry.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Author:Sherry
 * Date:2018/9/28
 * 作用：创建数据库表--县/区
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private int cityId;
    private String weatherId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
}