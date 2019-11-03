package com.example.hotel.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotel.activities.BookingListActivity;
import com.example.hotel.Models.Booking;
import com.example.hotel.R;
import com.example.hotel.interfaces.AdapterListner;

import java.util.ArrayList;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.offerHolder> {
    ArrayList<Booking> bookings ;
    Context context;
    AdapterListner listner;

    public BookingAdapter(ArrayList<Booking> bookings, Context context,AdapterListner listner) {
        this.bookings = bookings;
        this.context = context;
        this.listner=listner;
    }

    @NonNull
    @Override
    public offerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.row_booking,parent,false);
        offerHolder holder = new offerHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull offerHolder holder, final int position) {
        Booking booking = bookings.get(position);
        holder.imageViewBooking.setImageResource(booking.getOfferImage());
        holder.tvBooking.setText(booking.getOfferName());
        holder.tvBookingDescript.setText(booking.getOfferDescript());
    }

    @Override
    public int getItemCount() {
        return bookings.size();
    }

    public class offerHolder extends RecyclerView.ViewHolder{
        TextView tvBooking,tvBookingDescript;
        ImageView imageViewBooking;
        Button btnBooking;
        public offerHolder(@NonNull View itemView) {
            super(itemView);
            tvBooking=itemView.findViewById(R.id.tv_booking);
            tvBookingDescript=itemView.findViewById(R.id.tv_booking_descript);
            btnBooking=itemView.findViewById(R.id.booking_btn);
            imageViewBooking=itemView.findViewById(R.id.imagev_booking);
            btnBooking.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listner.onClick(view,getPosition());
                }
            });

        }

    }
    }

