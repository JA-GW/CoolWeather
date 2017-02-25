package com.gw.example.coolweather.gson;

/**
 * Created by gw on 2017/2/25.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
