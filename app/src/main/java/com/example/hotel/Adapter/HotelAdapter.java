package com.example.hotel.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotel.Models.Hotel;
import com.example.hotel.R;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {
    ArrayList<Hotel> hotels ;
    Context context;

    public HotelAdapter(ArrayList<Hotel> hotels, Context context) {
        this.hotels = hotels;
        this.context = context;
    }

    @NonNull
    @Override
    //creatig view
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.row,parent,false);
        HotelViewHolder hotelViewHolder = new HotelViewHolder(view);
        return hotelViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel hotel = hotels.get(position); //getting position from hotel class. i mean arraylist class (hotels)
        holder.imageView.setImageResource(hotel.getImage());
        holder.textv_name.setText(hotel.getName());
        holder.textv_descript.setText(hotel.getDescription());

    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {
        TextView textv_descript, textv_name;
        ImageView imageView;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);
            textv_descript=itemView.findViewById(R.id.textv_descript);
            textv_name=itemView.findViewById(R.id.textv_name);
            imageView=itemView.findViewById(R.id.image_v);
        }
    }
}
