package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class android1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android1);

        // hide action bar

        getSupportActionBar().hide();

        // views

        TextView a1 = findViewById(R.id.txt1);
        TextView a2 = findViewById(R.id.txt2);
        TextView a3 = findViewById(R.id.txt3);
        TextView a4 = findViewById(R.id.txt4);
        ImageView m1 = findViewById(R.id.hide);
    }
}