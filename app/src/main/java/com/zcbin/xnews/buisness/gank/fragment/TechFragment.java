package com.zcbin.xnews.buisness.gank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zcbin.xnews.R;
import com.zcbin.xnews.base.CommonSubscriber;
import com.zcbin.xnews.data.remote.RetrofitProvide;
import com.zcbin.xnews.data.remote.gank.GankApis;
import com.zcbin.xnews.data.remote.gank.GankResponse;
import com.zcbin.xnews.data.remote.gank.GankSearchBean;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by zhong on 2017/10/22.
 */

public class TechFragment extends Fragment {

    private RecyclerView recyclerView;
    protected CompositeDisposable compositeDisposable;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tech, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rc_tech);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Retrofit retrofit = RetrofitProvide.provide(GankApis.HOST);
        GankApis gankApis = retrofit.create(GankApis.class);
        gankApis.getSearchList("listview", "Android", 10, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CommonSubscriber<GankResponse<List<GankSearchBean>>>() {
                    @Override
                    public void onNext(GankResponse<List<GankSearchBean>> listGankResponse) {
                        Log.d("TAG", "onNext: ");
                    }
                });
    }
}
