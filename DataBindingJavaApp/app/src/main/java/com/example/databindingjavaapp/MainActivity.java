package com.example.databindingjavaapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import com.example.databindingjavaapp.databinding.ActivityMainBinding;
import com.example.databindingjavaapp.fragments.UrunDetayFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding; // this class name generates from layout name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        init();



    }

    private void init (){
        UrunDetayFragment urunDetayFragment = new UrunDetayFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,urunDetayFragment,"urunDetayFragment");
        fragmentTransaction.commit();
    }


}
