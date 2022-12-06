package com.example.sortinghatapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //start main screen after 2 seconds
        new Handler().postDelayed(() -> {
            //start main screen
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 2000); // = to 2 seconds
    }
}
