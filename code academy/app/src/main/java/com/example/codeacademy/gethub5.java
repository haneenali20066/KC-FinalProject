package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class gethub5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethub5);


        // hide action bar
        getSupportActionBar().hide();


        // Views

        TextView a43= findViewById(R.id.txt43);
        TextView a44 = findViewById(R.id.txt44);
        TextView a45= findViewById(R.id.txt45);
        TextView a46= findViewById(R.id.txt46);
        ImageView e1 = findViewById(R.id.ddd);
        ImageView e2 = findViewById(R.id.lllll);
        ImageView e3 = findViewById(R.id.fff);
    }
}