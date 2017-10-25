package com.zcbin.xnews.system;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zcbin.xnews.R;
import com.zcbin.xnews.base.BaseBackActivity;


public class SettingsActivity extends BaseBackActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initToolbar();
        getFragmentManager().beginTransaction().replace(R.id.settings_container, new SettingsFragment())
                .commit();
    }
}
