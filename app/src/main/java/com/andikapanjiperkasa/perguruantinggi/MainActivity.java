package com.andikapanjiperkasa.perguruantinggi;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvkampus;
    private ArrayList<Kampus> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvkampus = findViewById(R.id.rv_kampus);
        rvkampus.setHasFixedSize(true);

        list.addAll(DataKampus.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvkampus.setLayoutManager(new LinearLayoutManager(this));
        ListKampus listKampus = new ListKampus(list);
        rvkampus.setAdapter(listKampus);

        listKampus.setOnItemClickCallback(new ListKampus.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kampus data) {
                showSelectedKampus(data);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);

        }
    }


    private void showSelectedKampus(Kampus kampus) {
        Intent detail = new Intent(MainActivity.this,DetailKampus.class);
        detail.putExtra("KampusImages", kampus.getPhoto());
        detail.putExtra("KampusNames", kampus.getName());
        detail.putExtra("KampusDetails", kampus.getDetail());
        detail.putExtra("KampusAlamat", kampus.getAlamat());
        startActivity(detail);
    }
}
