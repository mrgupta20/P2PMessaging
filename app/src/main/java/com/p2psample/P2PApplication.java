package com.p2psample;

import android.app.Application;

import com.p2psample.util.FileLoggingTree;

import timber.log.Timber;

/**
 * Created by Purushottam Gupta on 2/6/2018.
 */

public class P2PApplication extends Application {
    private static P2PApplication sInstance;

    public static P2PApplication getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new FileLoggingTree(getApplicationContext()));
        }
    }
}
