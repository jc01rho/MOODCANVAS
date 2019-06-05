package com.example.moodcanvas;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.menu.MenuCalendar;
import com.example.menu.MenuFeedback;
import com.example.menu.MenuMain;
import com.example.menu.MenuMember;
import com.example.menu.MenuStatistics;


public class MainActivity extends AppCompatActivity {

    //FrameLayout 에 각 메뉴 Fragment 를 바꿔줌
    private FragmentManager fragmentManager = getSupportFragmentManager();

    // 5개의 메뉴에 들어갈 Fragment
    private MenuFeedback menuFeedback = new MenuFeedback();
    private MenuStatistics menuStatistics = new MenuStatistics();
    private MenuMain menuMain = new MenuMain();
    private MenuCalendar menuCalendar = new MenuCalendar();
    private MenuMember menuMember = new MenuMember();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        //첫 화면 지정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, menuMain).commitAllowingStateLoss();

        // bottomNavigationView 리스너 등록


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction1 = fragmentManager.beginTransaction();

                switch (menuItem.getItemId()){
                    case R.id.navigation_feedback:
                        transaction1.replace(R.id.frame_layout, menuFeedback).commitAllowingStateLoss();
                        return true;

                    case R.id.navigation_statistics:
                        transaction1.replace(R.id.frame_layout, menuStatistics).commitAllowingStateLoss();
                        return true;

                    case R.id.navigation_main:
                        transaction1.replace(R.id.frame_layout, menuMain).commitAllowingStateLoss();
                        return true;

                    case R.id.navigation_calendar:
                        transaction1.replace(R.id.frame_layout, menuCalendar).commitAllowingStateLoss();
                        return true;

                    case R.id.navigation_member:
                        transaction1.replace(R.id.frame_layout, menuMember).commitAllowingStateLoss();
                        return true;

                    default :
                        break;
                }

                return false;
            }
        });


    }
}
