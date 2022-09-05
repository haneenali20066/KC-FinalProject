package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class xcode1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcode1);

        // hide action bar
        getSupportActionBar().hide();

        // Views

        TextView a20= findViewById(R.id.txt20);
        TextView a21 = findViewById(R.id.txt21);
        ImageView p = findViewById(R.id.xxxxx);

    }
}