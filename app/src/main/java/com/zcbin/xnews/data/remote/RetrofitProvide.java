package com.zcbin.xnews.data.remote;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.zcbin.xnews.app.XApplication;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhong on 2017/10/22.
 */

public class RetrofitProvide {

    private static final int DEFAULT_TIMEOUT = 10;
    private Retrofit retrofit;

    private RetrofitProvide(String baseUrl) {
//        File httpCacheDirectory = new File(XApplication.getInstance().getCacheDir(), "cache");
//        Cache cache = new Cache(httpCacheDirectory, 10 * 1024 * 1024);
        OkHttpClient httpClient = new OkHttpClient.Builder()/*.cache(cache)*/
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseUrl)
                .build();
    }

    public static Retrofit provide(String baseUrl) {
        return new RetrofitProvide(baseUrl).retrofit;
    }

}
