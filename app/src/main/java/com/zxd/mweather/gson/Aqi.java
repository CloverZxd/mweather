package com.zxd.mweather.gson;

public class Aqi {

    public AqiCity city;


    public class AqiCity{

        public String aqi;

        public String pm25;

        public String alty;

        @Override
        public String toString() {
            return "AqiCity{" +
                    "aqi='" + aqi + '\'' +
                    ", pm25='" + pm25 + '\'' +
                    ", alty='" + alty + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Aqi{" +
                "city=" + city +
                '}';
    }
}
