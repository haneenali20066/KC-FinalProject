package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class xcode5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcode5);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a30= findViewById(R.id.txt30);
        TextView a31 = findViewById(R.id.txt31);

    }
}