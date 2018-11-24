package com.example.databindingjavaapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databindingjavaapp.databinding.FragmentUrunDetayBinding;
import com.example.databindingjavaapp.utils.Urunler;

public class UrunDetayFragment extends Fragment {

     FragmentUrunDetayBinding fragmentUrunDetayBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentUrunDetayBinding = fragmentUrunDetayBinding.inflate(inflater);

        Urunler urunler = new Urunler();
        fragmentUrunDetayBinding.setUrun(urunler.tumUrunlerDizi[3]);

        return fragmentUrunDetayBinding.getRoot();

    }


}
