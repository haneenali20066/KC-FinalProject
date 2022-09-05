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

public class gethubproblemsAdapter extends ArrayAdapter<gethubproblems> {


    List<gethubproblems> gethublistview ;


    public gethubproblemsAdapter(@NonNull Context context, int resource, @NonNull List<gethubproblems> objects) {
        super(context, resource, objects);

        gethublistview = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View gview = LayoutInflater.from(parent.getContext()).inflate(R.layout.gethubproblems_row,parent,false);

        gethubproblems currentgetproblems = gethublistview.get(position);

        TextView getproblemtxt = gview.findViewById(R.id.articleTitle1);

        getproblemtxt.setText(currentgetproblems.getGethubproblemslist());



        return gview;
    }
}

