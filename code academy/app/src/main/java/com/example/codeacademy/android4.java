package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class android4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android4);

        // hide action bar
        getSupportActionBar().hide();

        // Views

        TextView a15= findViewById(R.id.txt15);
        TextView a16 = findViewById(R.id.txt16);
        TextView a17 = findViewById(R.id.txt17);
        ImageView m555 = findViewById(R.id.qqqqq);
        ImageView m86 = findViewById(R.id.sssss);
    }
}