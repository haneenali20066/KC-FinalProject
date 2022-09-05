package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class register2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        // hide action bar

          getSupportActionBar().hide();


        // Views
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.TextPassword2);
        EditText password1 = findViewById(R.id.TextPassword1);
        EditText email = findViewById(R.id.EmailAddress2);
        Button register = findViewById(R.id.button2);
        TextView hello = findViewById(R.id.textView4);
        TextView signupp = findViewById(R.id.textView5);
        TextView account = findViewById(R.id.alreadyHaveAccount);


        //register button
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent( register2.this , apps.class );
                startActivity(signup);
            }
        });

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(register2.this , LoginActivity.class);
                startActivity(login);
            }
        });
    }
}