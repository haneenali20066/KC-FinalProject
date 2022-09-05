package com.example.codeacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Normalizer2;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class visualStudioCode extends AppCompatActivity {

    //Android ArryList

    ArrayList<VisualStudioProblems> visualstudioproblemslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_studio_code);

        // hide action bar

        getSupportActionBar().hide();

        //  Views
        ImageView backhooome = findViewById(R.id.backarrowhomee);
        ListView visualstudiolistview = findViewById(R.id.alistview87887);


        // back arrow
        backhooome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goooo = new Intent(visualStudioCode.this , apps.class);
                startActivity(goooo);
            }
        });


        //list View
        VisualStudioProblems NO1 = new VisualStudioProblems("Error during a repair");
        VisualStudioProblems NO2 = new VisualStudioProblems("How do i fix Visual Studio build errors?");
        VisualStudioProblems NO3 = new VisualStudioProblems("Is VS Code good for coding?");
        VisualStudioProblems NO4 = new VisualStudioProblems("Is VS Code good for beginners?");
        VisualStudioProblems NO5 = new VisualStudioProblems("How do I make my VS Code smoother?");


        visualstudioproblemslist.add(NO1);
        visualstudioproblemslist.add(NO2);
        visualstudioproblemslist.add(NO3);
        visualstudioproblemslist.add(NO4);
        visualstudioproblemslist.add(NO5);

        VisualStudioProblemsAdapter d = new VisualStudioProblemsAdapter(this , 0 , visualstudioproblemslist);

        visualstudiolistview.setAdapter(d);



        visualstudiolistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    // clicked "Error during a repair"
                    startActivity( new Intent(visualStudioCode.this , VisualStudioCode1.class));
                } else if (i==1){
                    // clicked "How do i fix Visual Studio build errors?"
                    startActivity( new Intent(visualStudioCode.this , VisualStudioCode2.class));
                } else if (i==2){
                    // clicked "Is VS Code good for coding?"
                    startActivity( new Intent(visualStudioCode.this , VisualStudioCode3.class));
                } else if (i==3){
                    // clicked "Is VS Code good for beginners?"
                    startActivity( new Intent(visualStudioCode.this , VisualStudioCode4.class));
                } else if (i==4){
                    // clicked "How do I make my VS Code smoother?"
                    startActivity( new Intent(visualStudioCode.this , VisualStudioCode5.class));
                }
            }
        });

    }
}