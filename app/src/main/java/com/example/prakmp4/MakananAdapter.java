package com.example.prakmp4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {
    private ArrayList<Makanan> dataList;

    public MakananAdapter(ArrayList<Makanan> dataList) {

        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MakananAdapter.MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_makanan, parent, false);
        return new MakananViewHolder(view);
    }

    public void onBindViewHolder(MakananViewHolder holder, int position) {
        holder.imPP.setImageResource(dataList.get(position).getGambar());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtHarga.setText(dataList.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtHarga;
        private ImageView imPP;

        public MakananViewHolder(View itemView) {
            super(itemView);
            imPP = (ImageView) itemView.findViewById(R.id.image_makanan);
            txtNama = (TextView) itemView.findViewById(R.id.nama_makanan);
            txtHarga = (TextView) itemView.findViewById(R.id.harga_makanan);
        }
    }
}
