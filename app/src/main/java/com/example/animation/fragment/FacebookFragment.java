package com.example.animation.fragment;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import com.airbnb.lottie.LottieAnimationView;
import com.example.animation.R;

public class FacebookFragment extends Fragment {
    private static final String ARG_POSITION = "slider-position";
    // prepare all title ids arrays
    @StringRes
    private static final int[] PAGE_TITLES =
            new int[] { R.string.facebook, R.string.messenger, R.string.like, R.string.heart, R.string.secure, R.string.bus };
    // prepare all subtitle ids arrays
    @StringRes
    private static final int[] PAGE_TEXT =
            new int[] {
                    R.string.telegram_text, R.string.fast_text, R.string.free_text, R.string.secure_text,R.string.powerful_text, R.string.cloud_text,
            };
    // prepare all subtitle animation arrays
    @StringRes
    private static final int[] PAGE_ANIMATION =
            new int[]{
                    R.raw.facebook, R.raw.messenger,R.raw.power_like,  R.raw.heart_reaction, R.raw.secure_f, R.raw.business_suite
            };

    private int position;
    public FacebookFragment() {
        // Required empty public constructor
    }

    public static FacebookFragment newInstance(int position) {
        FacebookFragment fragment = new FacebookFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_telegram_item, container, false);
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP) @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView title = view.findViewById(R.id.textView);
        TextView titleText = view.findViewById(R.id.textView2);
        LottieAnimationView animationView = view.findViewById(R.id.imageView);
        // set page title
        title.setText(PAGE_TITLES[position]);
        // set page sub title text
        titleText.setText(PAGE_TEXT[position]);
        // set page animation
        animationView.setAnimation(PAGE_ANIMATION[position]);
    }
}
