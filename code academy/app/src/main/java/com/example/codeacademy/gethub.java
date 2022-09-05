package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class gethub extends AppCompatActivity {


    //Get hub ArryList

    ArrayList<gethubproblems> getproblemslist = new ArrayList<>();

    //////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethub);

        // hide action bar

        getSupportActionBar().hide();

        //views
        ImageView geeet = findViewById(R.id.gethub22);
        ImageView backarrrow = findViewById(R.id.backarrowgethub);
        ListView gethublistview = findViewById(R.id.getlistview);

        //back arrow

        backarrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gobacktohome = new Intent(gethub.this , apps.class);
                startActivity(gobacktohome);
            }
        });

        //list View

        gethubproblems problem1 = new gethubproblems("What is get hub?");
        gethubproblems problem2 = new gethubproblems("Is get hub important?");
        gethubproblems problem3 = new gethubproblems("The steps of creating a fork");
        gethubproblems problem4 = new gethubproblems("Get hub or get hub dasktop");
        gethubproblems problem5 = new gethubproblems("steps of creating a repository");

        getproblemslist.add(problem1);
        getproblemslist.add(problem2);
        getproblemslist.add(problem3);
        getproblemslist.add(problem4);
        getproblemslist.add(problem5);


        gethubproblemsAdapter b = new gethubproblemsAdapter(this , 0 , getproblemslist);

        gethublistview.setAdapter(b);


        gethublistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    // clicked "What is get hub?"
                    startActivity( new Intent(gethub.this , gethub1.class));
                } else if (i==1){
                    // clicked "Is get hub important?"
                    startActivity( new Intent(gethub.this , gethub2.class));
                } else if (i==2){
                    // clicked "The steps of creating a fork"
                    startActivity( new Intent(gethub.this , gethub3.class));
                } else if (i==3){
                    // clicked "Get hub or get hub dasktop"
                    startActivity( new Intent(gethub.this , gethub4.class));
                } else if (i==4){
                    // clicked "steps of creating a repository"
                    startActivity( new Intent(gethub.this , gethub4.class));
                }
            }
        });
    }
}