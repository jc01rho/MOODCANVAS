package com.example.moodcanvas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class JoinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //MenuMember 받기
        Intent intent = getIntent();

        String memberCategory = intent.getStringExtra("memberCategory");

        switch (memberCategory){
            case "counselee" :
                setContentView(R.layout.join_counselee);
                break;

            case "counselor" :
                setContentView(R.layout.join_counselor); //뒤로 가기 안 됨!
                break;
        }
    }
}
