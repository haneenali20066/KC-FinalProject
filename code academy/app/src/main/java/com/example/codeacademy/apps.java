package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class apps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        // hide action bar

        getSupportActionBar().hide();

        //Views
        TextView txt = findViewById(R.id.textView2);
        ImageView android = findViewById(R.id.androidstudio);
        ImageView get = findViewById(R.id.gethub);
        ImageView xcodeapple = findViewById(R.id.xcode);
        ImageView visualstudiocode = findViewById(R.id.vsc);



        //android studio

      android.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent gotoandroid = new Intent(apps.this, android.class );
              startActivity(gotoandroid);

          }
      });


        // github
       get.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent gethubb = new Intent(apps.this , gethub.class);
               startActivity(gethubb);
           }
       });

        //xcode

        xcodeapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xcodee = new Intent(apps.this , xcode.class);
                startActivity(xcodee);
            }
        });

        //visualstudiocode
        visualstudiocode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vscode = new Intent(apps.this , visualStudioCode.class);
                startActivity(vscode);
            }
        });
    }
}