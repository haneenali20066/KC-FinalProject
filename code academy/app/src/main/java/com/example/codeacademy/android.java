package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class android extends AppCompatActivity {

    //Android ArryList

   ArrayList<AndroidProblems> androidproblemslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        // hide action bar

        getSupportActionBar().hide();

        //  Views
        ImageView back = findViewById(R.id.backarrow);
        ListView androidlistview = findViewById(R.id.alistview);


        // back arrow
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goback = new Intent(android.this , apps.class);
                startActivity(goback);
            }
        });


        //list View

        AndroidProblems firstproblem = new AndroidProblems("Hiding Action Bar");
        AndroidProblems Secondproblem = new AndroidProblems("Adding Buttons");
        AndroidProblems Thirdtproblem = new AndroidProblems(" Adding Photos");
        AndroidProblems forthproblem = new AndroidProblems("Adding Fonts");
        AndroidProblems problemNo5 = new AndroidProblems("Making new class");

        androidproblemslist.add(firstproblem);
        androidproblemslist.add(Secondproblem);
        androidproblemslist.add(Thirdtproblem);
        androidproblemslist.add(forthproblem);
        androidproblemslist.add(problemNo5);

        AndroidProblemsAdapter  a = new AndroidProblemsAdapter(this, 0 , androidproblemslist);

        androidlistview.setAdapter(a);



        androidlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    // clicked "Hiding Action Bar"
                   startActivity( new Intent(android.this , android1.class));
            } else if (i==1){
                    // clicked "Adding Buttons"
                      startActivity(new Intent(android.this , android2.class));
        } else if (i==2){
                    // clicked  " Adding Photos"
                    startActivity(new Intent(android.this , android3.class));

                } else if (i==3){
                    // clicked "Adding Fonts"
                    startActivity(new Intent(android.this , android4.class));


                } else if (i==4){
                    // clicked "Making new class"
                    startActivity(new Intent(android.this , android5.class));

                }

        }


    });
}}