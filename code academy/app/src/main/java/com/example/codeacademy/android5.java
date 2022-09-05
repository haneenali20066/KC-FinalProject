package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class android5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android5);
        // hide action bar

        getSupportActionBar().hide();

        TextView a18 = findViewById(R.id.txt18);
        TextView a19 = findViewById(R.id.txt19);
        ImageView mmm = findViewById(R.id.wwww);

    }

}