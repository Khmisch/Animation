package com.example.animation.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.animation.R;
import com.example.animation.adapter.TelegramFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class TelegramActivity extends AppCompatActivity {
    private ViewPager viewPager;
    TextView tv_message;
    private TelegramFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // making activity full screen

        setContentView(R.layout.activity_telegram);
        // hide action bar you can use NoAction theme as well
        getSupportActionBar().hide();
        // bind views
        viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tv_message = findViewById(R.id.tv_message);
        // init slider pager adapter
        adapter = new TelegramFragmentAdapter(getSupportFragmentManager(),
                TelegramFragmentAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        // set adapter
        viewPager.setAdapter(adapter);
        // set dot indicators
        tabLayout.setupWithViewPager(viewPager);
        // make status bar transparent

    }
}