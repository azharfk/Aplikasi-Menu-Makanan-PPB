package com.example.myapplication;

public class Kuliner {

    private String nama, harga, deskripsi;
    private int id_gambar;

    public Kuliner(String nama, String harga, String deskripsi, int id_gambar) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.id_gambar = id_gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }
}
