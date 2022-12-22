package com.si5b.bimbelku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterBimbel extends RecyclerView.Adapter<AdapterBimbel.VHBimbel> {
    private ArrayList<ModelBimbel> dataBimbel;
    private Context ctx;

    public AdapterBimbel(ArrayList<ModelBimbel> dataBimbel,Context ctx){
        this.dataBimbel=dataBimbel;
        this.ctx=ctx;
    }

    @NonNull
    @Override
    public VHBimbel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new VHBimbel(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBimbel.VHBimbel holder, int position) {
        ModelBimbel bimbel = dataBimbel.get(position);
        holder.tvNama.setText(bimbel.getNama());
        holder.tvTentang.setText(bimbel.getTentang());

        



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VHBimbel extends RecyclerView.ViewHolder {
        TextView tvNama,tvTentang;
        ImageView ivFoto;


        public VHBimbel(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}
