package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class xcode2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcode2);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a22= findViewById(R.id.txt22);
        TextView a23 = findViewById(R.id.txt23);
        TextView a24 = findViewById(R.id.txt24);
        ImageView p1 = findViewById(R.id.aaaa);


    }
}