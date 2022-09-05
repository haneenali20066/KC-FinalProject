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

public class VisualStudioProblemsAdapter extends ArrayAdapter<VisualStudioProblems> {


   List<VisualStudioProblems> visualstudiolistview ;

    public VisualStudioProblemsAdapter(@NonNull Context context, int resource, @NonNull List<VisualStudioProblems> objects) {
        super(context, resource, objects);

        visualstudiolistview = objects ;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       View vview = LayoutInflater.from(parent.getContext()).inflate(R.layout.visualstudio_row,parent,false);

       VisualStudioProblems currentvproblems = visualstudiolistview.get(position);

        TextView vproblemname = vview.findViewById(R.id.articleTitle3);

       vproblemname.setText(currentvproblems.getVproblemsname());


        return vview ;
    }
}
