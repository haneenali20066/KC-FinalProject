package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hide action bar
        getSupportActionBar().hide();

        // Toolbar
        // androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);



        //views
        Button getstarted = findViewById(R.id.button);
        TextView makeit = findViewById(R.id.textView);



        // get started button
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, register2.class );
                startActivity(intent);
            }
        });


    }
}