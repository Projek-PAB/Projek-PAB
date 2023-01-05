package com.si5b.bimbelku;

import static com.si5b.bimbelku.R.color.purple_500;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private TextView tvNama,tvTentang,tvAlamat,tvKoordinat;
    private ImageView ivFoto;
    private Button btnLokasi;
    private String yNama,yTentang,yFoto,yAlamat,yKoordinat;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(purple_500)));

        tvNama = findViewById(R.id.tv_nama);
        tvTentang = findViewById(R.id.tv_tentang);
        ivFoto = findViewById(R.id.iv_foto);
        tvAlamat = findViewById(R.id.tv_alamat);
        tvKoordinat = findViewById(R.id.tv_koordinat);
        btnLokasi = findViewById(R.id.btn_lokasi);

        Intent konfir = getIntent();
        yNama = konfir.getStringExtra("xNama");
        yTentang = konfir.getStringExtra("xTentang");
        yFoto = konfir.getStringExtra("xFoto");
        yAlamat = konfir.getStringExtra("xAlamat");
        yKoordinat = konfir.getStringExtra("xKoordinat");

        tvNama.setText(yNama);
        tvTentang.setText(yTentang);
        tvAlamat.setText(yAlamat);
        tvKoordinat.setText(yKoordinat);
        Glide.with(DetailActivity.this).load(yFoto).into(ivFoto);

        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriLokasi = Uri.parse("geo:0,0?q=" + yKoordinat);

                Intent bukaLokasi = new Intent(Intent.ACTION_VIEW, uriLokasi);
                startActivity(bukaLokasi);
            }
        });


    }
}
