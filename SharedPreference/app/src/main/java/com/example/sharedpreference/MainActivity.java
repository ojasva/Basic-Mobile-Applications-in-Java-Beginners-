package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button reg ,login;
    private String spname = "log";
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.textView);
        pass = findViewById(R.id.textView2);
        reg = findViewById(R.id.b1);
        login = findViewById(R.id.b2);
        final SharedPreferences sharepref = getSharedPreferences(spname,MODE_PRIVATE);

        reg.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                SharedPreferences.Editor speditor=sharepref.edit();
                String a = pass.getText().toString();
                int x = Integer.parseInt(user.getText().toString());
                int x2 = Integer.parseInt(pass.getText().toString());
                if((x*x) == x2) {
                    speditor.putString("Username",user.getText().toString());
                    speditor.putString("Password", pass.getText().toString());
                    speditor.apply();
                    Toast.makeText(getApplicationContext(), "Registered successfully", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid username password pair", Toast.LENGTH_SHORT).show();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String b = user.getText().toString();
                String c = sharepref.getString("Password" ,"");
                if(c.equals(pass.getText().toString()) && count < 3){
                    Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_LONG).show();
                }
                else{
                    if(count >= 3){
                        Toast.makeText(getApplicationContext(),"Max login attempts reached",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Login unsuccessful retry",Toast.LENGTH_LONG).show();
                        count++;
                    }
                }
            }
        });
    }
}