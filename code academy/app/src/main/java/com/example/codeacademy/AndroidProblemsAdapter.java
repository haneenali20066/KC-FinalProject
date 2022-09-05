package com.example.codeacademy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AndroidProblemsAdapter extends ArrayAdapter<AndroidProblems> {

    List<AndroidProblems> androidlistview;



    public AndroidProblemsAdapter(@NonNull Context context, int resource, @NonNull List<AndroidProblems> objects) {
        super(context, resource, objects);

        androidlistview = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View aview = LayoutInflater.from(parent.getContext()).inflate(R.layout.problems_row,parent,false);

       AndroidProblems currentproblems = androidlistview.get(position);

        TextView problemname =aview.findViewById(R.id.articleTitle);

        problemname.setText(currentproblems.getProblemsNames());


        return aview;
    }
}
