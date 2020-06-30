package com.example.lab.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lab.MainActivity;
import com.example.lab.R;
import com.example.lab.home.HomeActivity;
import com.example.lab.lab.LabActivity;
import com.example.lab.recap.RecapActivity;
import com.google.android.material.tabs.TabLayout;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.drawable.uang32, R.drawable.uang64, R.drawable.uang32};
    private final Context mContext;


    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeActivity a = new HomeActivity();
                return a;
            case 1:
                LabActivity b = new LabActivity();
                return b;
            case 2:
                RecapActivity c = new RecapActivity();
                return c;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "LAB";
            case 2:
                return "Recap";
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}