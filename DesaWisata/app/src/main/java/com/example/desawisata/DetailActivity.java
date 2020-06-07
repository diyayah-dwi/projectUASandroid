package com.example.desawisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView namadesa, kategoridesa, lokasidesa, tentangdesa, webdesa;
    Button btnweb;
    ImageView gambardesa;
    public static String id,kategori,nama,lokasi,deskripsi,gambar,website;
    public static  Double latitude,longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namadesa=findViewById(R.id.tv_nama);
        kategoridesa=findViewById(R.id.tv_kategori);
        lokasidesa=findViewById(R.id.tv_lokasi);
        tentangdesa=findViewById(R.id.tv_deskripsi);
        gambardesa=findViewById(R.id.img_desa);
        webdesa=findViewById(R.id.tv_website);
        btnweb=findViewById(R.id.btn_web);

        namadesa.setText(nama);
        kategoridesa.setText(kategori);
        lokasidesa.setText(lokasi);
        tentangdesa.setText(deskripsi);
        webdesa.setText(website);
        Picasso.get().load(gambar).into(gambardesa);

        btnweb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent pindahweb = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
        startActivity(pindahweb);
    }
}