package com.example.moodcanvas;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;


public class SplashActivity extends Activity {
    //수정하기

    // 로딩 화면 떠 있는 시간
    private final int SPALSH_DISPALY_LENGTH = 1000;
    private final String TAG = "MOODCANVAS ";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPALSH_DISPALY_LENGTH);
    }

}
