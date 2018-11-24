package com.example.databindingjavaapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databindingjavaapp.databinding.FragmentMainBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {


    FragmentMainBinding fragmentMainBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentMainBinding = FragmentMainBinding.inflate(inflater);

        fragmentMainBinding.swipeRefreshLayout.setOnRefreshListener(this);

        return fragmentMainBinding.getRoot();

    }

    @Override
    public void onRefresh() {



    }
}
