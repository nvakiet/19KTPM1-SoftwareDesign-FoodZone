package com.example.foodzoneclient;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public class FoodZone extends Application {
    private static Context mContext;


    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
