package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



import com.unnamed.b.atv.model.TreeNode;

public class ScheduleItemViewHolder extends TreeNode.BaseNodeViewHolder {

    TextView scheduleTV;
    ImageView expandIV;
    ImageView collapseIV;


    public ScheduleItemViewHolder(Context context) {
        super(context);


    }

    @Override
    public View createNodeView(TreeNode node, Object value) {

        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(R.layout.schedule_item, null, false);

        scheduleTV = view.findViewById(R.id.schedule_name_schedule_tv);

        scheduleTV.setText(value.toString());
        return view;
    }

    @Override
    public void toggle(boolean active) {
    }
}