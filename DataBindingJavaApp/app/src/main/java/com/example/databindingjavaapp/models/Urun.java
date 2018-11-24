package com.example.databindingjavaapp.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Urun implements Parcelable {

    private String aciklama;
    private int urunResim;
    private double fiyat;
    private double kampanyaliFiyat;
    private int degerlendirmeSayisi;
    private float degerlendirmeNotu; // rating bar
    private int seriNumarasi;
    private String baslik;

    public boolean kampanyaVarMi(){
        if (kampanyaliFiyat > 0){
            return true;
        } else {
            return false;
        }
    }

    public String mikrariAlVeStringeCevir (int miktar) {

        return "miktar : " +  String.valueOf(miktar);

    }


    public Urun(String baslik, String aciklama, int urunResim, double fiyat, double kampanyaliFiyat, int degerlendirmeSayisi, float degerlendirmeNotu, int seriNumarasi) {
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.urunResim = urunResim;
        this.fiyat = fiyat;
        this.kampanyaliFiyat = kampanyaliFiyat;
        this.degerlendirmeSayisi = degerlendirmeSayisi;
        this.degerlendirmeNotu = degerlendirmeNotu;
        this.seriNumarasi = seriNumarasi;
    }


    protected Urun(Parcel in) {
        aciklama = in.readString();
        urunResim = in.readInt();
        fiyat = in.readDouble();
        kampanyaliFiyat = in.readDouble();
        degerlendirmeSayisi = in.readInt();
        degerlendirmeNotu = in.readFloat();
        seriNumarasi = in.readInt();
        baslik = in.readString();
    }


    public static final Creator<Urun> CREATOR = new Creator<Urun>() {
        @Override
        public Urun createFromParcel(Parcel in) {
            return new Urun(in);
        }

        @Override
        public Urun[] newArray(int size) {
            return new Urun[size];
        }
    };

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }



    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getKampanyaliFiyat() {
        return kampanyaliFiyat;
    }

    public void setKampanyaliFiyat(double kampanyaliFiyat) {
        this.kampanyaliFiyat = kampanyaliFiyat;
    }

    public int getDegerlendirmeSayisi() {
        return degerlendirmeSayisi;
    }

    public void setDegerlendirmeSayisi(int degerlendirmeSayisi) {
        this.degerlendirmeSayisi = degerlendirmeSayisi;
    }

    public float getDegerelendirmeNotu() {
        return degerlendirmeNotu;
    }

    public void setDegerelendirmeNotu(float degerelendirmeNotu) {
        this.degerlendirmeNotu = degerelendirmeNotu;
    }

    public int getSeriNumarasi() {
        return seriNumarasi;
    }

    public void setSeriNumarasi(int seriNumarasi) {
        this.seriNumarasi = seriNumarasi;
    }


    public int getUrunResim() {
        return urunResim;
    }

    public void setUrunResim(int urunResim) {
        this.urunResim = urunResim;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(aciklama);
        parcel.writeInt(urunResim);
        parcel.writeDouble(fiyat);
        parcel.writeDouble(kampanyaliFiyat);
        parcel.writeInt(degerlendirmeSayisi);
        parcel.writeFloat(degerlendirmeNotu);
        parcel.writeInt(seriNumarasi);
        parcel.writeString(baslik);
    }
}
