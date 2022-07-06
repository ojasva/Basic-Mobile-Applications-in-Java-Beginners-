 package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = findViewById(R.id.GridView1);
        ArrayList<Item>  List = new ArrayList<Item>();
        List.add(new Item("DSA", R.drawable.one));
        List.add(new Item("JAVA", R.drawable.two));
        List.add(new Item("C++", R.drawable.three));
        List.add(new Item("Python", R.drawable.four));

        MyAdapter adapter = new MyAdapter(this, List);
        grid.setAdapter(adapter);
    }
}