package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class android2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android2);

        // hide action bar

        getSupportActionBar().hide();

        // views

        TextView a5 = findViewById(R.id.txt5);
        TextView a6 = findViewById(R.id.txt6);
        TextView a7 = findViewById(R.id.txt7);
        TextView a8 = findViewById(R.id.txt8);
        TextView a9 = findViewById(R.id.txt9);
        ImageView m2 = findViewById(R.id.design);
        ImageView m3 = findViewById(R.id.buttonnnn);
    }
}