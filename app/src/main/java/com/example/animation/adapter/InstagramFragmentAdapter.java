package com.example.animation.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.animation.fragment.InstagramFragment;
import com.example.animation.fragment.TelegramFragment;

public class InstagramFragmentAdapter extends FragmentPagerAdapter {
    public InstagramFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull @Override public Fragment getItem(int position) {
        return InstagramFragment.newInstance(position);
    }
    // size is hardcoded
    @Override public int getCount() {
        return 6;
    }
}
