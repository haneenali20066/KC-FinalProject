package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class xcode4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcode4);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a27= findViewById(R.id.txt27);
        TextView a28 = findViewById(R.id.txt28);
        TextView a29 = findViewById(R.id.txt29);
        ImageView p8 = findViewById(R.id.gggg);
    }
}