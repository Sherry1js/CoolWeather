package com.sherry.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Sherry
 * Date:2018/9/29
 * 作用：
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
