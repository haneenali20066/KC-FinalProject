package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class xcode extends AppCompatActivity {

    //xcode ArryList

    ArrayList<XcodeProblems> xcodeproblemslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcode);

        // hide action bar

        getSupportActionBar().hide();

        //  Views
        ImageView back1 = findViewById(R.id.backarrow4);
        ListView xcodelistview = findViewById(R.id.alistview6);


        // back arrow
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gobackkk = new Intent(xcode.this , apps.class);
                startActivity(gobackkk);
            }
        });

        //list View

        XcodeProblems p1 = new  XcodeProblems ("Adding photos");
        XcodeProblems p2 = new  XcodeProblems ("Adding Buttons");
        XcodeProblems p3 = new  XcodeProblems ("Steps of Adding fonts");
        XcodeProblems p4 = new  XcodeProblems ("steps of adding an emulater");
        XcodeProblems p5 = new  XcodeProblems ("Clean the build");

        xcodeproblemslist.add(p1);
        xcodeproblemslist.add(p2);
        xcodeproblemslist.add(p3);
        xcodeproblemslist.add(p4);
        xcodeproblemslist.add(p5);

        XcodeProblemsAdapter c = new XcodeProblemsAdapter(this , 0 , xcodeproblemslist);


        xcodelistview.setAdapter(c);


        xcodelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    // clicked "Adding photos"
                    startActivity( new Intent(xcode.this , xcode1.class));
                } else if (i==1){
                    // clicked "Adding Buttons"
                    startActivity( new Intent(xcode.this , xcode2.class));
                } else if (i==2){
                    // clicked "Steps of Adding fonts"
                    startActivity( new Intent(xcode.this , xcode3.class));
                } else if (i==3){
                    // clicked "steps of adding an emulater"
                    startActivity( new Intent(xcode.this , xcode4.class));
                } else if (i==4){
                    // clicked "Clean the build"
                    startActivity( new Intent(xcode.this , xcode5.class));
                }
            }
        });


    }


}