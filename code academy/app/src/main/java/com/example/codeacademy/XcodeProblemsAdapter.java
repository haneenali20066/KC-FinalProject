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

public class XcodeProblemsAdapter extends ArrayAdapter<XcodeProblems> {

    List<XcodeProblems> xcodelistview ;


    public XcodeProblemsAdapter(@NonNull Context context, int resource, @NonNull List<XcodeProblems> objects) {
        super(context, resource, objects);

        xcodelistview = objects ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View xview = LayoutInflater.from(parent.getContext()).inflate(R.layout.xcode_row,parent,false);

        XcodeProblems currentxproblems = xcodelistview.get(position);

        TextView xproblemtxt = xview.findViewById(R.id.articleTitle2);

        xproblemtxt.setText(currentxproblems.getXcodename());


        return xview;
    }
}
