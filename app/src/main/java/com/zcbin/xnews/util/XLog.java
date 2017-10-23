package com.zcbin.xnews.util;

import android.util.Log;

/**
 * Created by zhong on 2017/10/23.
 */

public class XLog {
    private static final boolean isDebug = true;
    private static final String DEFAULT_TAG = "XNews";

    public static void d(String msg) {
        d(DEFAULT_TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void v(String msg) {
        v(DEFAULT_TAG, msg);
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.v(tag, msg);
        }
    }

    public static void e(String msg) {
        e(DEFAULT_TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void i(String msg) {
        i(DEFAULT_TAG, msg);
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }
}
