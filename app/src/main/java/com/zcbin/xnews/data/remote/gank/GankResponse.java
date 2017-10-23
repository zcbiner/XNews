package com.zcbin.xnews.data.remote.gank;

/**
 * Created by zhong on 2017/10/22.
 * Gank返回json
 */

public class GankResponse<T> {

    private boolean error;
    private T results;

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
