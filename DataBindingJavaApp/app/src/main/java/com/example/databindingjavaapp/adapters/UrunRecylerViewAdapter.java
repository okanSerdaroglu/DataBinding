package com.example.databindingjavaapp.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.databindingjavaapp.R;
import com.example.databindingjavaapp.databinding.TekSutunUrunLayoutBinding;
import com.example.databindingjavaapp.models.Urun;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class UrunRecylerViewAdapter extends RecyclerView.Adapter<UrunRecylerViewAdapter.ViewHolder> {


    private List<Urun> tumUrunler = new ArrayList<>();
    private Context context;

    public UrunRecylerViewAdapter (Context context, List<Urun>tumUrunler){
        this.context = context;
        this.tumUrunler = tumUrunler;
    }

    @NonNull
    @Override
    public UrunRecylerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View view = LayoutInflater.from(context).inflate(R.layout.tek_sutun_urun_layout,parent,false);
        //return new ViewHolder(view);

        TekSutunUrunLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context),
                        R.layout.tek_sutun_urun_layout,parent,false);
        return new ViewHolder(binding.getRoot());

    }

    @Override
    public void onBindViewHolder(@NonNull UrunRecylerViewAdapter.ViewHolder holder, int position) {

        //holder.setData(tumUrunler.get(position),position);
        Urun urun = tumUrunler.get(position);
        holder.binding.setUrun(urun);
        holder.binding.executePendingBindings(); // bir sonraki satırı beklemeden onunla ilgili bindingleri yapmak için bu metod

    }

    @Override
    public int getItemCount() {
        return tumUrunler.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //ConstraintLayout tumLayout;
        //TextView baslik;
        //TextView fiyat;

        TekSutunUrunLayoutBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            binding = DataBindingUtil.bind(itemView); // verilen datalar itemView a bağlanır

            //tumLayout = itemView.findViewById(R.id.tumLayout);
            //baslik = itemView.findViewById(R.id.tvUrunBaslik);
            //fiyat = itemView.findViewById(R.id.tvFiyat);
        }

        public void setData (Urun urun,int position){

            //baslik.setText(urun.getBaslik());
            //fiyat.setText(""+urun.getFiyat());

        }

    }
}
