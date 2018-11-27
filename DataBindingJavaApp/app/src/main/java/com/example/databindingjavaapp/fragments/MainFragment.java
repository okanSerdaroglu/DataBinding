package com.example.databindingjavaapp.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databindingjavaapp.adapters.UrunRecylerViewAdapter;
import com.example.databindingjavaapp.databinding.FragmentMainBinding;
import com.example.databindingjavaapp.models.Urun;
import com.example.databindingjavaapp.utils.Urunler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {


    FragmentMainBinding fragmentMainBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentMainBinding = FragmentMainBinding.inflate(inflater);

        fragmentMainBinding.swipeRefreshLayout.setOnRefreshListener(this);

        setUrunlerRecylerView ();

        return fragmentMainBinding.getRoot();

    }


    @Override
    public void onRefresh() {

    }

    private void setUrunlerRecylerView() {


        GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
        fragmentMainBinding.tumUrunlerRecylerView.setLayoutManager(manager);

        Urunler urunler = new Urunler();
        List<Urun>tumUrunler = new ArrayList<>();
        tumUrunler.addAll(Arrays.asList(urunler.tumUrunlerDizi));

        UrunRecylerViewAdapter urunRecylerViewAdapter = new UrunRecylerViewAdapter(getActivity(),tumUrunler);
        fragmentMainBinding.tumUrunlerRecylerView.setAdapter(urunRecylerViewAdapter);


    }



}
