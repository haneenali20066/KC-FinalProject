package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class xcode3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcode3);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a25= findViewById(R.id.txt25);
        TextView a26 = findViewById(R.id.txt26);
        ImageView p5 = findViewById(R.id.tttt);
    }
}