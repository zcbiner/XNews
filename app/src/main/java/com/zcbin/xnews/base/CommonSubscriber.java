package com.zcbin.xnews.base;

import com.zcbin.xnews.util.XLog;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * Created by zhong on 2017/10/23.
 * 封装Subscirber，统一提示错误
 */

public abstract class CommonSubscriber<T> extends ResourceSubscriber<T> {

    @Override
    public void onError(Throwable t) {
        XLog.e("CommonSubscriber onError");
    }

    @Override
    public void onComplete() {
        XLog.d("CommonSubscriber onComplete");
    }
}
