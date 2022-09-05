package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class android3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android3);

        // hide action bar

        getSupportActionBar().hide();

        // views

        TextView a10 = findViewById(R.id.txt10);
        TextView a11 = findViewById(R.id.txt11);
        TextView a12 = findViewById(R.id.txt12);
        TextView a13 = findViewById(R.id.txt13);
        TextView a14 = findViewById(R.id.txt14);
        ImageView m6 = findViewById(R.id.hhhh);


    }
}