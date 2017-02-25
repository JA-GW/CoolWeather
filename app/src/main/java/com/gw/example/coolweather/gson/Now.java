package com.gw.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gw on 2017/2/25.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More moew;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
