package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button music1 = findViewById(R.id.b1);
        Button music2 = findViewById(R.id.b2);
        Button music3 = findViewById(R.id.b3);
        Button music4 = findViewById(R.id.b4);
        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , MyService.class);
                intent.putExtra("music", 1);
                startService(intent);
            }
        });
        music2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , MyService.class);
                intent.putExtra("music", 2);
                startService(intent);
            }
        });
        music3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , MyService.class);
                intent.putExtra("music", 3);
                startService(intent);
            }
        });
        music4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , MyService.class);
                intent.putExtra("music", 4);
                startService(intent);
            }
        });
    }
}