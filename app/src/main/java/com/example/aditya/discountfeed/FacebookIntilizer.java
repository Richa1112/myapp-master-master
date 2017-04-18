package com.example.aditya.discountfeed;

/**
 * Created by radha on 4/18/2017.
 */

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by radha on 3/23/2017.
 */

public class FacebookIntilizer extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

    }
}

