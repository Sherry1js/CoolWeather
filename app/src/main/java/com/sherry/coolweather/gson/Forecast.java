package com.sherry.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Sherry
 * Date:2018/9/29
 * 作用：
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
