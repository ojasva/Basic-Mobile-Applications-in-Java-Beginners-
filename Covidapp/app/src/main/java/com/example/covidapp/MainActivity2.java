package com.example.covidapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity {
        private TextView e11,e12,e13, c11,c12,c13,c14,result;
        // TextView c11,c12,c13,c14;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
            e11=findViewById(R.id.e11);
            e12=findViewById(R.id.e12);
            e13=findViewById(R.id.e13);
            result=findViewById(R.id.result);
            c11=findViewById(R.id.c11);
            c12=findViewById(R.id.c12);
            c13=findViewById(R.id.c13);
            c14=findViewById(R.id.c14);
            String ee1=getIntent().getStringExtra("keyname");
            e11.setText(ee1);
            String ee2=getIntent().getStringExtra("keyplace");
            e12.setText(ee2);
            String ee3=getIntent().getStringExtra("keyaadhaar");
            e13.setText(ee3);
            String cb1=getIntent().getStringExtra("keycb1");
            c11.setText(cb1);
            String cb2=getIntent().getStringExtra("keycb2");
            c12.setText(cb2);
            String cb3=getIntent().getStringExtra("keycb3");
            c13.setText(cb3);
            String cb4=getIntent().getStringExtra("keycb4");
            c14.setText(cb4);
            String res=getIntent().getStringExtra("keyresult");
            result.setText(res);
        }
    }
