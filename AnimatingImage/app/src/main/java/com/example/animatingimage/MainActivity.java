package com.example.animatingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ImageView first, second;
    FloatingActionButton b1;
    ScaleAnimation scale,scale2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.imageView);
        second = findViewById(R.id.imageView2);
        b1 = findViewById(R.id.floatingActionButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                        scale = new ScaleAnimation(0, 2, 0, 2);
                        scale.setDuration(500);
                        first.startAnimation(scale);
                        scale2 = new ScaleAnimation(0, 3, 0, 3);
                        scale2.setDuration(500);
                        second.startAnimation(scale2);
            }
        });
    }
}