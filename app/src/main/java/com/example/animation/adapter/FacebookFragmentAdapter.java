package com.example.animation.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.animation.fragment.FacebookFragment;
import com.example.animation.fragment.TelegramFragment;

public class FacebookFragmentAdapter extends FragmentPagerAdapter {
    public FacebookFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull @Override public Fragment getItem(int position) {
        return FacebookFragment.newInstance(position);
    }
    // size is hardcoded
    @Override public int getCount() {
        return 6;
    }
}
