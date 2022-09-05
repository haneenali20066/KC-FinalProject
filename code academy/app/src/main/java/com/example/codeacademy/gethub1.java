package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class gethub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethub1);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a32= findViewById(R.id.txt32);
        TextView a33 = findViewById(R.id.txt33);
        TextView a34= findViewById(R.id.txt34);
    }
}