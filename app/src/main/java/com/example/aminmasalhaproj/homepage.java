package com.example.aminmasalhaproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    Button homebt;
    TextView tvwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        homebt=findViewById(R.id.homebt);
        Intent i = getIntent();
        String name = i.getStringExtra("UserName");
        tvwelcome = findViewById(R.id.hometxt);
        tvwelcome.setText("welcome to the home page "+name);
        homebt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(homepage.this,MainActivity.class));
            }
        });
    }

}