package com.example.cl.contexttest;

import android.app.Application;
import android.content.Context;

/**
 * Created by cl on 2015/8/31.
 */
public class MyApplication extends Application {

    private static Context context;
    @Override
    public void onCreate(){
        context = getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }

}
