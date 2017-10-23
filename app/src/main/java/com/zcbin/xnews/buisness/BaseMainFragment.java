package com.zcbin.xnews.buisness;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zcbin.xnews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhong on 2017/10/23.
 * 具有TabLayout+ViewPager的Fragment
 */

public abstract class BaseMainFragment extends Fragment {
    protected TabLayout tabLayout;
    protected ViewPager viewPager;
    protected List<Fragment> fragments = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base_main, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_main);
        viewPager = (ViewPager) view.findViewById(R.id.vp_main);
        return view;
    }
}
