package com.example.animation.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.animation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_anim, bt_telegram;

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
}