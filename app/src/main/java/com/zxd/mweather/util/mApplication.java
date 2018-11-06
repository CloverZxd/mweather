package com.zxd.mweather.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

public class mApplication extends Application{


    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
//        LitePalApplication.getContext();
       LitePalApplication.initialize(context);
    }


    public static Context getContext(){
        return context;

    }
}
