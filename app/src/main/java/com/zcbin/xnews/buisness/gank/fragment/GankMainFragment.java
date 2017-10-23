package com.zcbin.xnews.buisness.gank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.zcbin.xnews.buisness.BaseMainFragment;
import com.zcbin.xnews.buisness.MainFragmentVPAdapter;

/**
 * Created by zhong on 2017/10/22.
 */

public class GankMainFragment extends BaseMainFragment {
    public static String[] tabTitle = new String[]{"Android","iOS","前端","福利"};

    private TechFragment androidFragment;
    private TechFragment iosFragment;
    private TechFragment webFragment;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        androidFragment = new TechFragment();
        iosFragment = new TechFragment();
        webFragment = new TechFragment();

        fragments.add(androidFragment);
        fragments.add(iosFragment);
        fragments.add(webFragment);

        MainFragmentVPAdapter adapter = new MainFragmentVPAdapter(getChildFragmentManager(), fragments, tabTitle);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
