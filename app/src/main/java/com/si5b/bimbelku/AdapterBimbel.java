package com.si5b.bimbelku;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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
    public void onBindViewHolder(@NonNull VHBimbel holder, int position) {
        ModelBimbel bimbel = dataBimbel.get(position);
        holder.tvNama.setText(bimbel.getNama());
        holder.tvTentang.setText(bimbel.getTentang());
        holder.tvAlamat.setText(bimbel.getAlamat());
        holder.tvKoordinat.setText(bimbel.getKoordinat());

        Glide
                .with(ctx)
                .load(bimbel.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNama,xTentang,xFoto,xAlamat,xKoordinat;
                xNama = bimbel.getNama();
                xTentang = bimbel.getTentang();
                xFoto = bimbel.getFoto();
                xAlamat = bimbel.getAlamat();
                xKoordinat = bimbel.getKoordinat();

                Intent send = new Intent(ctx, DetailActivity.class);
                send.putExtra("xNama",xNama);
                send.putExtra("xTentang",xTentang);
                send.putExtra("xFoto",xFoto);
                send.putExtra("xAlamat",xAlamat);
                send.putExtra("xKoordinat",xKoordinat);
                ctx.startActivity(send);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBimbel.size();
    }

    public class VHBimbel extends RecyclerView.ViewHolder {
        TextView tvNama,tvTentang,tvAlamat,tvKoordinat;
        ImageView ivFoto;


        public VHBimbel(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
            tvKoordinat = itemView.findViewById(R.id.tv_koordinat);
        }
    }
}
