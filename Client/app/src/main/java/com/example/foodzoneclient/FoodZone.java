package com.example.foodzoneclient;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

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

    public static void showToast(Handler target, String announcement) {
        target.post(new Runnable() {
            @Override
            public void run() {
                Toast announce = Toast.makeText(getContext(), announcement, Toast.LENGTH_SHORT);
                announce.show();
            }
        });
    }
}
