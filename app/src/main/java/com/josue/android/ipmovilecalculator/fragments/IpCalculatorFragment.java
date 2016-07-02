package com.josue.android.ipmovilecalculator.fragments;


import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;

import com.josue.android.ipmovilecalculator.R;
import com.josue.android.ipmovilecalculator.adapters.ListAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class IpCalculatorFragment extends Fragment {
    @Bind(R.id.calcRecyclerview)
    RecyclerView calcRecyclerview;


    ListAdapter adapter;
    public IpCalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ip_calculator, container, false);
        ButterKnife.bind(this, view);
        initAdapter();
        InitRecyclerView();
        return view;
    }

    private void InitRecyclerView() {
        calcRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        calcRecyclerview.setAdapter(adapter);
    }

    private void initAdapter() {
        if (adapter == null) {
            adapter =  new ListAdapter();
        }
    }


}
