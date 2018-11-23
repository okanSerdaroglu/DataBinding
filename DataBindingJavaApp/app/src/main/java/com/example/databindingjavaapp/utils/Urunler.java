package com.example.databindingjavaapp.utils;
import com.example.databindingjavaapp.R;
import com.example.databindingjavaapp.models.Urun;
import java.util.HashMap;

public class Urunler {


    public Urun [] tumUrunlerDizi = {KIRMIZI_KUPA,MAVI_KUPA,KIRMIZI_LAMBA,SARI_LAMBA,BEYAZ_SAPKA,
                                    TURUNCU_SAPKA,BEYAZ_KUPA,BEYAZ_SAPKA};

    public HashMap<String,Urun> tumUrunlerMap = new HashMap<>();


    public Urunler () {
        for (Urun urun : tumUrunlerDizi){
            tumUrunlerMap.put(String.valueOf(urun.getSeriNumarasi()),urun);
        }
    }

    public static final Urun KIRMIZI_LAMBA=new Urun("Kırmızı Lamba","Harika bir lamba",
            R.drawable.red_lamp,25.99,22.99,142,4.5f,123456);

    public static final Urun SARI_LAMBA = new Urun("Sarı Lamba",
            "Harika bir sarı lamba", R.drawable.yellow_lamp,24.99,0,122,
            3.5f,212123);

    public static final Urun MAVI_KUPA = new Urun("Mavi Kahve Kupası",
            "Yüzde yüz seramik bir mavi kahve kupası", R.drawable.blue_mug,6.99,0,84,
            2.0f,952123);

    public static final Urun BEYAZ_KUPA = new Urun("Beyaz Kahve Kupası",
            "Yüzde yüz seramik bir beyaz kahve kupası", R.drawable.white_mug,5.99,0,152,
            2.5f,214523);

    public static final Urun KIRMIZI_KUPA = new Urun("Kırmızı Kahve Kupası",
            "Yüzde yüz seramik bir kırmızı kahve kupası", R.drawable.red_mug,9.99,7.99,65,
            3.0f,987456);


    public static final Urun MAVI_SAPKA = new Urun("Mavi Baseball Şapka",
            "El yapımı mavi baseball şapkası", R.drawable.blue_hat,27.99,0,84,
            5.0f,952923);

    public static final Urun BEYAZ_SAPKA = new Urun("Beyaz Baseball Şapka",
            "El yapımı beyaz baseball şapkası", R.drawable.white_hat,24.99,0,84,
            4.0f,954653);

    public static final Urun TURUNCU_SAPKA = new Urun("Turuncu Baseball Şapka",
            "El yapımı turuncu baseball şapkası", R.drawable.orange_hat,29.99,21.55,84,
            4.8f,951433);

}
