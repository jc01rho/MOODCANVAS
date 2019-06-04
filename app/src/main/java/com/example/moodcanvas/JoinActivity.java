package com.example.moodcanvas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.firestore.Counselee;
import com.example.firestore.Counselor;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


public class JoinActivity extends Activity {
    public static final String TAG = "member_join";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //MenuMember 받기
        final Intent intent = getIntent();

        String memberCategory = intent.getStringExtra("memberCategory");

        if (intent != null && memberCategory != null){

            switch (memberCategory){
                case "counselee" :
                    setContentView(R.layout.join_counselee);

                    ImageButton send_counselee = findViewById(R.id.btn_send_c);
                    send_counselee.setOnClickListener(new Button.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            //내담자 입력 정보 받아오기
                            EditText c_name = findViewById(R.id.editText_c_name);
                            String name_c = c_name.getText().toString();
                            EditText c_email = findViewById(R.id.editText_c_email);
                            String email_c = c_email.getText().toString();
                            EditText c_phone = findViewById(R.id.editText_c_phone);
                            String phone_c = c_phone.getText().toString();
                            EditText c_password = findViewById(R.id.editText_c_password);
                            String password_c = c_password.getText().toString();

                            //DB에 넣을 객체 생성
                            final Counselee counselee = new Counselee(name_c, email_c, phone_c, password_c);

                            FirebaseFirestore db = FirebaseFirestore.getInstance();
                            db.collection("members")
                                    .add(counselee)
                                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                        @Override
                                        public void onSuccess(DocumentReference documentReference) {
                                            Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                            Intent intent1 = new Intent(JoinActivity.this, SetGoalActivity.class);
                                        }
                                    })
                                    .addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            Log.w(TAG, "Error adding document", e);
                                        }
                                    });
                        }
                    });

                    break;

                case "counselor" :
                    setContentView(R.layout.join_counselor);
                    Button send_counselor = findViewById(R.id.btn_send_m);
                    send_counselor.setOnClickListener(new Button.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            //상담사 입력 정보 받아오기
                            EditText m_name = findViewById(R.id.editText_m_name);
                            String name_m = m_name.getText().toString();
                            EditText m_email = findViewById(R.id.editText_m_email);
                            String email_m = m_email.getText().toString();
                            EditText m_phone = findViewById(R.id.editText_m_phone);
                            String phone_m = m_phone.getText().toString();
                            EditText m_password = findViewById(R.id.editText_m_password);
                            String password_m = m_password.getText().toString();

                            //DB에 넣을 객체 생성
                            final Counselor counselor = new Counselor(name_m, email_m, phone_m, password_m);

                            FirebaseFirestore db = FirebaseFirestore.getInstance();
                            db.collection("members")
                                    .add(counselor)
                                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                        @Override
                                        public void onSuccess(DocumentReference documentReference) {
                                            Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                        }
                                    })
                                    .addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            Log.w(TAG, "Error adding document", e);
                                        }
                                    });
                        }
                    });
                    break;

                default:
                    setContentView(R.layout.join_main);
                    break;
            }
        }
    }
}
