package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualStudioCode4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_studio_code4);

        // hide action bar

        getSupportActionBar().hide();


        TextView a52= findViewById(R.id.txt52);
        TextView a53 = findViewById(R.id.txt53);
        ImageView e9 = findViewById(R.id.v2);
    }
}