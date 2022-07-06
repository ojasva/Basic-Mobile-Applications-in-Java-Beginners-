package com.example.scaleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    boolean allFabVisible = false;
    boolean b2FabVisible = false;
    boolean b3FabVisible = false;
    boolean b4FabVisible = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.fab);
        b2 = findViewById(R.id.fab2);
        b3 = findViewById(R.id.fab3);
        b4 = findViewById(R.id.fab4);
        b5 = findViewById(R.id.fab5);
        b6 = findViewById(R.id.fab6);
        b7 = findViewById(R.id.fab7);
        b8 = findViewById(R.id.fab8);
        b9 = findViewById(R.id.fab9);
        b10 = findViewById(R.id.fab10);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
        b5.setVisibility(View.GONE);
        b6.setVisibility(View.GONE);
        b7.setVisibility(View.GONE);
        b8.setVisibility(View.GONE);
        b9.setVisibility(View.GONE);
        b10.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!allFabVisible){
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    allFabVisible = true;
                }
                else{
                    b2.setVisibility(View.GONE);
                    b3.setVisibility(View.GONE);
                    b4.setVisibility(View.GONE);
                    b5.setVisibility(View.GONE);
                    b6.setVisibility(View.GONE);
                    b7.setVisibility(View.GONE);
                    b8.setVisibility(View.GONE);
                    b9.setVisibility(View.GONE);
                    b10.setVisibility(View.GONE);
                    allFabVisible = false;
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!b2FabVisible){
                    b5.setVisibility(View.VISIBLE);
                    b6.setVisibility(View.VISIBLE);
                    b2FabVisible = true;
                }
                else{
                    b5.setVisibility(View.GONE);
                    b6.setVisibility(View.GONE);
                    b2FabVisible = false;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!b3FabVisible){
                    b7.setVisibility(View.VISIBLE);
                    b8.setVisibility(View.VISIBLE);
                    b3FabVisible = true;
                }
                else{
                    b7.setVisibility(View.GONE);
                    b8.setVisibility(View.GONE);
                    b3FabVisible = false;
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!b4FabVisible){
                    b9.setVisibility(View.VISIBLE);
                    b10.setVisibility(View.VISIBLE);
                    b4FabVisible = true;
                }
                else{
                    b9.setVisibility(View.GONE);
                    b10.setVisibility(View.GONE);
                    b4FabVisible = false;
                }
            }
        });
    }
}