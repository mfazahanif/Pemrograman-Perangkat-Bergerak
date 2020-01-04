package com.example.kartunsaya;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardKartunAdapter extends RecyclerView.Adapter<CardKartunAdapter.ListViewHolder> {
    private ArrayList<Kartun> listKartun;
    private Context context;

    public CardKartunAdapter(Context context, ArrayList<Kartun> listKartun){
        this.listKartun = listKartun;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_kartun, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Kartun kartun = listKartun.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kartun.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);

        holder.tvName.setText(kartun.getName());
        holder.tvDesc.setText(kartun.getDescription());

        holder.cv.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailListKartun.class);
                intent.putExtra("kartun_id", kartun.getId());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listKartun.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_kartun_list);
            tvName = itemView.findViewById(R.id.nama_kartun_list);
            tvDesc = itemView.findViewById(R.id.desc_kartun_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
