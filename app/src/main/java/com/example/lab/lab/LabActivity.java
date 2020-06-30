package com.example.lab.lab;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.lab.R;

import java.util.ArrayList;
import java.util.List;


public class LabActivity extends Fragment {
    RecyclerView mList1,mList2;
    List<App> appList;

    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_lab, container, false);

//        mList1 = (RecyclerView) root.findViewById(R.id.list1);
//        mList2 = (RecyclerView) root.findViewById(R.id.list2);
//        appList = new ArrayList<>();
//
//        appList.add(new App(R.drawable.bd,"DB1_A1",40));
//        appList.add(new App(R.drawable.bd,"BD1_A2",30));
//        appList.add(new App(R.drawable.bd,"DB1_A3",20));
//        appList.add(new App(R.drawable.bd,"DB1_B1",22));
//        appList.add(new App(R.drawable.bd,"DB1_B2",40));
//        appList.add(new App(R.drawable.bd,"DB1_B3",34));

//        RecyclerView.LayoutManager manager1 = new LinearLayoutManager(getActivity());
//        LinearLayoutManager manager1 = new LinearLayoutManager(this);
//        ((LinearLayoutManager) manager1).setOrientation(LinearLayoutManager.HORIZONTAL);
//        mList1.setLayoutManager(manager1);
//
//        RecyclerView.LayoutManager manager2 = new LinearLayoutManager(getActivity());
//        LinearLayoutManager manager2 = new LinearLayoutManager(this);
//        ((LinearLayoutManager) manager2).setOrientation(LinearLayoutManager.HORIZONTAL);
//        mList2.setLayoutManager(manager2);

//        CustomAdaptor adaptor1 = new CustomAdaptor(this,appList);
//        mList1.setAdapter(adaptor1);
//
//        CustomAdaptor adaptor2 = new CustomAdaptor(this,appList);
//        mList2.setAdapter(adaptor2);
        return root;
    }

}
