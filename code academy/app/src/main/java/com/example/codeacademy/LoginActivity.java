package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // hide action bar

        getSupportActionBar().hide();

        TextView btn=findViewById(R.id.textViewSignUp);
        Button loginbutton = findViewById(R.id.btnlogin);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(LoginActivity.this , apps.class);
                startActivity(s);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent c = new Intent(LoginActivity.this , register2.class);
            }
        });



}
    }