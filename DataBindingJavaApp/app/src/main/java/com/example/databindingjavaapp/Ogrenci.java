package com.example.databindingjavaapp;

public class Ogrenci {

    private int no;
    private String isim;

    public Ogrenci (int no, String isim){
        this.no = no;
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }



}
