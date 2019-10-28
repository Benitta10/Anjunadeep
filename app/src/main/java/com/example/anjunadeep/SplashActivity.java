package com.example.anjunadeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private Handler mhandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mRunnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),Artist_List.class));
            }
        };

        mhandler = new Handler();
        mhandler.postDelayed(mRunnable,2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mhandler != null && mRunnable != null ){
            mhandler.removeCallbacks(mRunnable);
        }
    }
}
