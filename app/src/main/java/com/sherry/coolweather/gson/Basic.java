package com.sherry.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Sherry
 * Date:2018/9/29
 * 作用：解析天气中的basic内容
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
