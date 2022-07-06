package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    String ee1,ee2,ee3;
    String cb1,cb2,cb3,cb4;
    CheckBox c1,c2,c3,c4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        c4 = (CheckBox) findViewById(R.id.c4);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ee1 = e1.getText().toString();
                ee2 = e2.getText().toString();
                ee3 = e3.getText().toString();
                Intent intent = new
                        Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("keyname", ee1);
                intent.putExtra("keyplace", ee2);
                intent.putExtra("keyaadhaar", ee3);
                if (c1.isChecked() && c2.isChecked() && c3.isChecked() &&
                        c4.isChecked()) {
                    String res = "Covid Positive";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold Cough";
                    String cb2 = "Fever";
                    String cb3 = "No smell";
                    String cb4 = "Vomiting";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && c2.isChecked() && c3.isChecked()
                        && c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = "Fever";
                    String cb3 = "No smell";
                    String cb4 = "Vomiting";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && !c2.isChecked() && c3.isChecked() &&
                        c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold Cough";
                    String cb2 = " ";
                    String cb3 = "No smell";
                    String cb4 = "Vomiting";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && c2.isChecked() && !c3.isChecked() &&
                        c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold Cough";
                    String cb2 = "Fever";
                    String cb3 = " ";
                    String cb4 = "Vomiting";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && c2.isChecked() && c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold Cough";
                    String cb2 = "Fever";
                    String cb3 = "No smell";
                    String cb4 = " ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && !c2.isChecked() && c3.isChecked() &&
                        c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = " ";
                    String cb3 = "No smell";
                    String cb4 = "vomiting ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && c2.isChecked() && !c3.isChecked() &&
                        c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = "Fever ";
                    String cb3 = " ";
                    String cb4 = "vomiting ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && c2.isChecked() && c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = "Fever ";
                    String cb3 = "No smell ";
                    String cb4 = " ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && !c2.isChecked() && !c3.isChecked() &&
                        c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold cough";
                    String cb2 = " ";
                    String cb3 = " ";
                    String cb4 = "Vomiting";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && !c2.isChecked() && c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold cough";
                    String cb2 = " ";
                    String cb3 = " No smell";
                    String cb4 = "";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && c2.isChecked() && !c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold cough";
                    String cb2 = "Fever";
                    String cb3 = " ";
                    String cb4 = "";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (c1.isChecked() && !c2.isChecked() && !c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = "Cold cough";
                    String cb2 = " ";
                    String cb3 = " ";
                    String cb4 = " ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && c2.isChecked() && !c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = "Fever ";
                    String cb3 = " ";
                    String cb4 = " ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && !c2.isChecked() && c3.isChecked() &&
                        !c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = " ";
                    String cb3 = "No smell ";
                    String cb4 = " ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else if (!c1.isChecked() && !c2.isChecked() && !c3.isChecked()
                        && c4.isChecked()) {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    String cb1 = " ";
                    String cb2 = " ";
                    String cb3 = " ";
                    String cb4 = "Vomiting ";
                    intent.putExtra("keycb1", cb1);
                    intent.putExtra("keycb2", cb2);
                    intent.putExtra("keycb3", cb3);
                    intent.putExtra("keycb4", cb4);
                } else {
                    String res = "Covid Negative";
                    intent.putExtra("keyresult", res);
                    if (c1.isChecked()) {
                        String cb1 = "Cold Cough";
                    } else {
                        String cb1 = " ";
                    }
                    if (c2.isChecked()) {
                        String cb2 = "Fever";
                    } else {
                        String cb2 = " ";
                    }
                    if (c3.isChecked()) {
                        String cb3 = "No smell";
                    } else {
                        String cb3 = " ";
                    }
                    if (c4.isChecked()) {
                        String cb4 = "Vomiting";
                    } else {
                        String cb4 = " ";
                    }
                }
                startActivity(intent);
            }
        });
    }
}
