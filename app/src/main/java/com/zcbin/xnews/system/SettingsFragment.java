package com.zcbin.xnews.system;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

import com.zcbin.xnews.R;

/**
 * Created by zcbin on 2017/10/25.
 */

public class SettingsFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener,
        Preference.OnPreferenceClickListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        return false;
    }
}
