package com.example.animation.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.animation.R;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {

    Button b_blink, b_zoom, b_fade, b_rotate, b_slide, b_move;
    ImageView iv_sample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        initViews();
    }

    private void initViews() {
        iv_sample = findViewById(R.id.iv_sample);
        b_blink = findViewById(R.id.b_blink);
        b_blink.setOnClickListener(this);
        b_zoom = findViewById(R.id.b_zoom);
        b_zoom.setOnClickListener(this);
        b_fade = findViewById(R.id.b_fade);
        b_fade.setOnClickListener(this);
        b_rotate = findViewById(R.id.b_rotate);
        b_rotate.setOnClickListener(this);
        b_slide = findViewById(R.id.b_slide);
        b_slide.setOnClickListener(this);
        b_move = findViewById(R.id.b_move);
        b_move.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        Animation animation;
        switch (view.getId()) {
            case R.id.b_zoom:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                iv_sample.startAnimation(animation);
                break;
            case R.id.b_blink:
                animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                iv_sample.startAnimation(animation);
                break;
            case R.id.b_fade:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                iv_sample.startAnimation(animation);
                break;
            case R.id.b_slide:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
                iv_sample.startAnimation(animation);
                break;
            case R.id.b_move:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                iv_sample.startAnimation(animation);
                break;
            case R.id.b_rotate:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                iv_sample.startAnimation(animation);
                break;
        }

    }
}