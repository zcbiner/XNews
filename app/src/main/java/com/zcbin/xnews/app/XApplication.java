package com.zcbin.xnews.app;

import android.app.Application;

/**
 * Created by zhong on 2017/10/22.
 */

public class XApplication extends Application {
    private static XApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static XApplication getInstance() {
        return instance;
    }
}
