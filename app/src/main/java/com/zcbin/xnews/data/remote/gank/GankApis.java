package com.zcbin.xnews.data.remote.gank;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by zhong on 2017/10/21.
 */

public interface GankApis {
    String HOST = "http://gank.io/api/";

    /**
     * 技术文章列表
     */
    @GET("data/{tech}/{num}/{page}")
    Flowable<GankResponse<List<GankItemBean>>> getTechList(@Path("tech") String tech, @Path("num") int num, @Path("page") int page);

    /**
     * 妹纸列表
     */
    @GET("data/福利/{num}/{page}")
    Flowable<GankResponse<List<GankItemBean>>> getGirlList(@Path("num") int num, @Path("page") int page);

    /**
     * 随机妹纸图
     */
    @GET("random/data/福利/{num}")
    Flowable<GankResponse<List<GankItemBean>>> getRandomGirl(@Path("num") int num);

    /**
     * 搜索
     *
     * category 后面可接受参数 all | Android | iOS | 休息视频 | 福利 | 拓展资源 | 前端 | 瞎推荐 | App
     * count 最大 50
     */
    @GET("search/query/{query}/category/{type}/count/{count}/page/{page}")
    Flowable<GankResponse<List<GankSearchBean>>> getSearchList(@Path("query") String query,@Path("type") String type,@Path("count") int num,@Path("page") int page);
}
