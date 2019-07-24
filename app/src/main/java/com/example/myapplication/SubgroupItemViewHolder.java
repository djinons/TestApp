package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.unnamed.b.atv.model.TreeNode;

public class SubgroupItemViewHolder extends TreeNode.BaseNodeViewHolder {

    TextView subgroupTV;



    public SubgroupItemViewHolder(Context context) {
        super(context);


    }

    @Override
    public View createNodeView(TreeNode node, Object value) {

        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(R.layout.subgroup_item, null, false);

        subgroupTV = view.findViewById(R.id.subgroup_tv);

        subgroupTV.setText(value.toString());
        return view;
    }

    @Override
    public void toggle(boolean active) {
    }
}