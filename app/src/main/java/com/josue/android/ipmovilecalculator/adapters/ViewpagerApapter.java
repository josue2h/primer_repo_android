package com.josue.android.ipmovilecalculator.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.josue.android.ipmovilecalculator.fragments.IpCalculatorFragment;
import com.josue.android.ipmovilecalculator.fragments.SubnetFragment;
import com.josue.android.ipmovilecalculator.fragments.SupernetFragment;

/**
 * Created by Josue on 27/06/2016.
 */
public class ViewpagerApapter extends FragmentPagerAdapter {
    private String title [] = {"Calculadora","Subredes","Superredes"};

    public ViewpagerApapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                IpCalculatorFragment fragment = new IpCalculatorFragment();
                fragment.setRetainInstance(true);
                return fragment;
            case 1:
                return new SubnetFragment();
            case 2:
                return new SupernetFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
