package com.example.databindingjavaapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.example.databindingjavaapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding; // this class name generates from layout name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Ogrenci ogr1 = new Ogrenci(1,"okan");
        Ogrenci ogr2 = new Ogrenci(2, "Büşra");

        /*mainBinding.ogrNO.setText(String.valueOf(ogr1.getNo()));
        mainBinding.tvIsim.setText(ogr1.getIsim());*/

        mainBinding.setOgrenci(ogr2);

    }
}
