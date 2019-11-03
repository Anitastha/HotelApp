package com.example.hotel.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotel.Models.Booking;
import com.example.hotel.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    ArrayList<Booking> bookings;
    Context context;
    public ListAdapter(ArrayList<Booking> bookings, Context context) {
        this.bookings = bookings;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_bookinglist,parent,false);
        ListViewHolder listViewHolder = new ListViewHolder(view);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Booking booking=bookings.get(position);
        holder.images.setImageResource(booking.getOfferImage());
        holder.names.setText(booking.getOfferName());
        holder.descs.setText(booking.getOfferDescript());
    }

    @Override
    public int getItemCount() {
        return bookings.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        TextView names, descs;
        CircleImageView images;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            names = itemView.findViewById(R.id.item_name);
           descs = itemView.findViewById(R.id.item_desc);
            images = itemView.findViewById(R.id.item_img);
        }
    }
}
