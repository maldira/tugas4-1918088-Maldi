package com.example.prakmp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MakananAdapter adapter;
    private ArrayList<Makanan> makananArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recycleview);

        adapter = new MakananAdapter(makananArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan(R.drawable.nasgor,"Nama Makanan : Nasi Goreng ", "Harga Makanan : 25000"));
        makananArrayList.add(new Makanan(R.drawable.bakso,"Nama Makanan : Bakso ", "Harga Makanan : 20000"));
        makananArrayList.add(new Makanan(R.drawable.sate,"Nama Makanan : Sate Ayam ", "Harga Makanan : 30000"));
    }
}