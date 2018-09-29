package com.sherry.coolweather.gson;

/**
 * Author:Sherry
 * Date:2018/9/29
 * 作用：
 */

public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
