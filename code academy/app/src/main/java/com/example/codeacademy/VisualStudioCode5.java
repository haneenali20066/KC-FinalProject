package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualStudioCode5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_studio_code5);

        // hide action bar

        getSupportActionBar().hide();


        TextView a54= findViewById(R.id.txt54);
        TextView a55 = findViewById(R.id.txt55);
        ImageView v3 = findViewById(R.id.v3);
    }
}