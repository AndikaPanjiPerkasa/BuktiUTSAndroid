package com.andikapanjiperkasa.perguruantinggi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailKampus extends AppCompatActivity {
    Toolbar back;
    ImageView imagekampus;
    TextView namekampus, detailkampus, alamatkampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kampus);

        imagekampus = findViewById(R.id.img_item_photo);
        namekampus = findViewById(R.id.tv_item_name);
        detailkampus = findViewById(R.id.tv_item_detail);
        alamatkampus= findViewById(R.id.tv_item_alamat);


        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int photo = getIntent().getIntExtra("KampusImages", 0);
        String nama = getIntent().getStringExtra("KampusNames");
        String deskripsi = getIntent().getStringExtra("KampusDetails");
        String alamat = getIntent().getStringExtra("KampusAlamat");
        imagekampus.setImageResource(photo);
        namekampus.setText(nama);
        detailkampus.setText(deskripsi);
        alamatkampus.setText(alamat);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}
