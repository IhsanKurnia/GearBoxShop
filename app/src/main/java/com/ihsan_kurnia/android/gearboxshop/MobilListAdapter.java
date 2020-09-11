package com.ihsan_kurnia.android.gearboxshop;

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

public class MobilListAdapter extends RecyclerView.Adapter<MobilListAdapter.ListViewHolder> {

    private ArrayList<Mobil> listMobil;

    MobilListAdapter(ArrayList<Mobil> list) {
        this.listMobil = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_mobil, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobilListAdapter.ListViewHolder holder, final int position) {
        final Mobil mobil = listMobil.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mobil.getPhotoCars())
                .into(holder.imgPhoto);
        holder.tvName.setText(mobil.getNameCars());
        holder.tvYears.setText(mobil.getYears());
        holder.tvManufacture.setText(mobil.getManufacture());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoDetailActivity(view, mobil.getNameCars(), mobil.getPhotoCars(), mobil.getTextDetail());


            }
        });
    }


    private void gotoDetailActivity(View view, String nameCars, int photoCars, String textDetail) {
        Intent intent = new Intent(view.getContext(), DetailMobilActivity.class);
        intent.putExtra("nameCars", nameCars);
        intent.putExtra("photoCars", photoCars);
        intent.putExtra("textDetail", textDetail);
        view.getContext().startActivity(intent);
    }


    @Override
    public int getItemCount() {
        return listMobil.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvYears, tvManufacture;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_mobil);
            tvName = itemView.findViewById(R.id.tv_name_cars);
            tvYears = itemView.findViewById(R.id.tv_years);
            tvManufacture = itemView.findViewById(R.id.tv_manufacture);
        }


    }
}