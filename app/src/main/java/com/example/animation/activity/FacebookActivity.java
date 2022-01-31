package com.example.animation.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.animation.R;
import com.example.animation.adapter.FacebookFragmentAdapter;
import com.example.animation.adapter.TelegramFragmentAdapter;
import com.google.android.material.tabs.TabLayout;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class FacebookActivity extends AppCompatActivity {

    private ViewPager viewPager;
    TextView tv_message;
    private FacebookFragmentAdapter adapter;
    WormDotsIndicator dotsIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        getSupportActionBar().hide();
        // bind views
        viewPager = findViewById(R.id.viewpager);

        tv_message = findViewById(R.id.tv_message);
        // init slider pager adapter
        adapter = new FacebookFragmentAdapter(getSupportFragmentManager(),
                FacebookFragmentAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        // set adapter
        viewPager.setAdapter(adapter);
        // set dot indicators
        dotsIndicator = (WormDotsIndicator) findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(viewPager);
        // make status bar transparent

    }
}