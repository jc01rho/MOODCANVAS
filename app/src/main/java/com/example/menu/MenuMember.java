package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.moodcanvas.JoinActivity;
import com.example.moodcanvas.R;


public class MenuMember extends Fragment {

    public static String memberCategory = "";

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //넘어온 화면 보여주기
        final View menuMemberView = inflater.inflate(R.layout.join_main, container, false);

        //내담자 가입 화면으로 넘어가기
        ImageButton button_join_counselee = menuMemberView.findViewById(R.id.btn_counselee);
        button_join_counselee.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                memberCategory = "counselee";
                Intent intent = new Intent(menuMemberView.getContext(), JoinActivity.class);
                intent.putExtra("memberCategory", memberCategory);
                startActivity(intent);
            }
        });

        //상담사 가입 화면으로 넘어가기
        ImageButton button_join_counselor = menuMemberView.findViewById(R.id.btn_counselor);
        button_join_counselor.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                memberCategory = "counselor";
                Intent intent = new Intent(menuMemberView.getContext(), JoinActivity.class);
                startActivity(intent);
                intent.putExtra("memberCategory", memberCategory);
                startActivity(intent);
            }
        });

        return menuMemberView;
    }
}
