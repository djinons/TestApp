package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.unnamed.b.atv.model.TreeNode;
import com.unnamed.b.atv.view.AndroidTreeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ViewGroup containerView = findViewById(R.id.container);

        TreeNode root = TreeNode.root();

        TreeNode parent = new TreeNode("Administration");
        TreeNode child0 = new TreeNode("Admission officer");
        TreeNode child1 = new TreeNode("HR Manager");

        TreeNode parent1 = new TreeNode("Hospital");
        TreeNode child01 = new TreeNode("Clinical services");
        TreeNode child11 = new TreeNode("GP");

        TreeNode child111 = new TreeNode("Nurse");
        TreeNode child121 = new TreeNode("Doctor");

        parent.addChildren(child0, child1);
        root.addChild(parent);

        parent1.addChildren(child01, child11);
        root.addChild(parent1);

        child0.addChildren(child111);
        child0.addChildren(child121);

        parent.setViewHolder(new ScheduleItemViewHolder(this));
        parent1.setViewHolder(new ScheduleItemViewHolder(this));

        child0.setViewHolder(new SubgroupItemViewHolder(this));
        child1.setViewHolder(new SubgroupItemViewHolder(this));

        child01.setViewHolder(new SubgroupItemViewHolder(this));
        child11.setViewHolder(new SubgroupItemViewHolder(this));

        child111.setViewHolder(new SubgroupItemViewHolder(this));
        child121.setViewHolder(new SubgroupItemViewHolder(this));

        AndroidTreeView tView = new AndroidTreeView(this, root);

        tView.setDefaultAnimation(true);


        containerView.addView(tView.getView());
    }
}
