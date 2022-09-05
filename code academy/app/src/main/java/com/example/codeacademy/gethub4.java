package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class gethub4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethub4);

        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a41 = findViewById(R.id.txt41);
        TextView a42 = findViewById(R.id.txt42);
    }
}