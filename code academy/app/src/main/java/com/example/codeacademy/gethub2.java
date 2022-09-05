package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class gethub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethub2);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a35= findViewById(R.id.txt35);
        TextView a36 = findViewById(R.id.txt36);
    }
}