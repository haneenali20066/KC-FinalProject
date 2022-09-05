package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualStudioCode3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_studio_code3);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a50= findViewById(R.id.txt50);
        TextView a51 = findViewById(R.id.txt51);
        ImageView e9 = findViewById(R.id.v2);
    }
}