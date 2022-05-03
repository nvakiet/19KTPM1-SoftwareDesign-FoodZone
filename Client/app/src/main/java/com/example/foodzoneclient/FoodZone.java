package com.example.foodzoneclient;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.cloudinary.android.MediaManager;

public class FoodZone extends Application {
    private static Context mContext;
    private static Toast announce = null;

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

        // Initialize Cloudinary Media Manager
        MediaManager.init(mContext);
    }

    public static void showToast(Handler target, String announcement) {
        target.post(new Runnable() {
            @Override
            public void run() {
                announce = Toast.makeText(getContext(), announcement, Toast.LENGTH_SHORT);
                announce.show();
            }
        });
    }

    public static void showToastOverride(Handler target, String announcement) {
        target.post(new Runnable() {
            @Override
            public void run() {
                if (announce != null) {
                    announce.cancel();
                }
                announce = Toast.makeText(getContext(), announcement, Toast.LENGTH_SHORT);
                announce.show();
            }
        });
    }
}
