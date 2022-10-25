package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Soto Ayam",
                "15.000",
                "soto sueger siap menemanimu ketika cuaca mendung dan hujan",
                R.drawable.soto));
        listKuliner.add(new Kuliner("Mie Ayam",
                "10.000",
                "mie ayam dijamin enak lho",
                R.drawable.mieayam));
        listKuliner.add(new Kuliner("Bakso Sapi",
                "10.000",
                "bakso bulat seperti bola ping pong kalo lewat membikin perut kosong",
                R.drawable.bakso));
        listKuliner.add(new Kuliner("Ayam Kremes",
                "20.000",
                "rasakan kriuk kremes dari ayam kremes ini dijamin kres kres",
                R.drawable.ayam));
        listKuliner.add(new Kuliner("Sate Ayam",
                "20.000",
                "sate ayam dengan saus kacang yang menggungah selera makan kalian",
                R.drawable.sate));

    }
}