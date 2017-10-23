package com.zcbin.xnews.buisness;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by zhong on 2017/10/23.
 */

public class MainFragmentVPAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private String[] pageTitles;

    public MainFragmentVPAdapter(FragmentManager fm, List<Fragment> fragments, String[] pageTitles) {
        super(fm);
        this.fragments = fragments;
        this.pageTitles = pageTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles[position];
    }
}
