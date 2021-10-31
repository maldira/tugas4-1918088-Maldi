package com.example.prakmp4;

public class Makanan {
    private String nama,harga;
    private int gambar;
    public Makanan(int gambar,String nama, String harga) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public int getGambar(){
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }
}
