package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualStudioCode1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_studio_code1);


        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a47= findViewById(R.id.txt47);
        TextView a48 = findViewById(R.id.txt48);
        ImageView e8 = findViewById(R.id.v11);
    }
}