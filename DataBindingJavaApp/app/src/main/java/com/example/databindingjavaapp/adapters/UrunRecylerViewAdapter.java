package com.example.databindingjavaapp.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.databindingjavaapp.R;
import com.example.databindingjavaapp.models.Urun;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class UrunRecylerViewAdapter extends RecyclerView.Adapter<UrunRecylerViewAdapter.ViewHolder> {


    private List<Urun> tumUrunler = new ArrayList<>();
    private Context context;

    public UrunRecylerViewAdapter (Context context,List<Urun>tumUrunler){
        this.context = context;
        this.tumUrunler = tumUrunler;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tek_sutun_urun_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.setData (tumUrunler.get(position), position);

    }

    @Override
    public int getItemCount() {
        return tumUrunler.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout tumLayout;
        TextView baslik;
        TextView fiyat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tumLayout = itemView.findViewById(R.id.tumLayout);
            baslik = itemView.findViewById(R.id.tvUrunBaslik);
            fiyat = itemView.findViewById(R.id.tvFiyat);

        }

        public void setData(Urun urun, int position) {

            baslik.setText(urun.getBaslik());
            fiyat.setText(""+urun.getFiyat());

        }
    }
}
