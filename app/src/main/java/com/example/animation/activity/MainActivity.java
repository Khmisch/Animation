package com.example.animation.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.animation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_anim, bt_telegram, bt_facebook, bt_instagram, bt_twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        bt_anim = findViewById(R.id.bt_anim);
        bt_anim.setOnClickListener(this);
        bt_telegram = findViewById(R.id.bt_telegram);
        bt_telegram.setOnClickListener(this);
        bt_facebook = findViewById(R.id.bt_facebook);
        bt_facebook.setOnClickListener(this);
        bt_instagram = findViewById(R.id.bt_instagram);
        bt_instagram.setOnClickListener(this);
        bt_twitter = findViewById(R.id.bt_twitter);
        bt_twitter.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_anim:
                callAnimationActivity();
                break;
            case R.id.bt_telegram:
                callTelegramActivity();
                break;
            case R.id.bt_facebook:
                callFacebookActivity();
                break;
            case R.id.bt_instagram:
                callInstagramActivity();
                break;
            case R.id.bt_twitter:
                callTwitterActivity();
                break;
        }

    }

    private void callAnimationActivity() {
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }
    private void callTelegramActivity() {
        Intent intent = new Intent(this, TelegramActivity.class);
        startActivity(intent);
    }
    private void callFacebookActivity() {
        Intent intent = new Intent(this, FacebookActivity.class);
        startActivity(intent);
    }
    private void callInstagramActivity() {
        Intent intent = new Intent(this, InstagramActivity.class);
        startActivity(intent);
    }
    private void callTwitterActivity() {
        Intent intent = new Intent(this, TwitterActivity.class);
        startActivity(intent);
    }
}