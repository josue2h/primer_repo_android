package com.josue.android.ipmovilecalculator.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.josue.android.ipmovilecalculator.R;
import com.josue.android.ipmovilecalculator.adapters.ViewpagerApapter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    @Bind(R.id.mainToolbar)
    Toolbar mainToolbar;

    @Bind(R.id.mainViewpager)
    ViewPager mainViewpager;
    @Bind(R.id.mainTablayout)
    TabLayout mainTablayout;
    @Bind(R.id.calcBtnFloat)
    FloatingActionButton calcBtnFloat;
    ViewpagerApapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mainToolbar);
        initTabs();
    }

    private void initTabs() {
        adapter = new ViewpagerApapter(getSupportFragmentManager());
        mainViewpager.setAdapter(adapter);
        mainTablayout.setupWithViewPager(mainViewpager);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
       mainViewpager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        mainViewpager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        mainViewpager.setCurrentItem(tab.getPosition());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
