package com.example.kartunsaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKartun;
    private ArrayList<Kartun> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.item_about){
            startActivity(new Intent(this, AboutMe.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Kartun Saya");
        }

        rvKartun = findViewById(R.id.rv_kartun);
        rvKartun.setHasFixedSize(true);

        list.addAll(KartunData.getListData());
        showRecylerList();
    }
    private void showRecylerList(){
        rvKartun.setLayoutManager(new LinearLayoutManager(this));
        CardKartunAdapter cardKartunAdapter = new CardKartunAdapter(this, list);
        rvKartun.setAdapter(cardKartunAdapter);
    }
}
