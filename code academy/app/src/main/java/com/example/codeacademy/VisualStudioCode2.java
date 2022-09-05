package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualStudioCode2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_studio_code2);


        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a49= findViewById(R.id.txt49);
        TextView a50 = findViewById(R.id.txt50);
        ImageView v111 = findViewById(R.id.v111);
    }
}