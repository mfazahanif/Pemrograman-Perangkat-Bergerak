package com.example.kartunsaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListKartun extends AppCompatActivity {
    private int kartun_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Kartun> listKartun = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_kartun);

        kartun_id = getIntent().getIntExtra("kartun_id",0);
        tvName = findViewById(R.id.nama_kartun);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listKartun.addAll(KartunData.getListData());

        setLayout();
    }

    void setLayout(){
        tvName.setText(listKartun.get(kartun_id).getName());
        tvDesc.setText(listKartun.get(kartun_id).getDescription());
        Glide.with(this)
                .load(listKartun.get(kartun_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
