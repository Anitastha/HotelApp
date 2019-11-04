package com.example.hotel.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotel.Adapter.ListAdapter;
import com.example.hotel.Models.Booking;
import com.example.hotel.R;

import java.util.ArrayList;


public class BookingListActivity extends AppCompatActivity {
    ArrayList<Booking> bookings = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_list);
        RecyclerView recyclerView = findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(bookings,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
        loadValue();
    }
    public void goBack(View view) {
        super.onBackPressed();
    }
    public void loadValue(){
        bookings.add(new Booking("Party's not over yet!",R.drawable.party,"Find an oyo for your after-party."));
        bookings.add(new Booking("Nature at it's best",R.drawable.nature,"Breathtaking views await you."));
        bookings.add(new Booking("Taking a business trip?",R.drawable.hotel,"Get an OYO in prime locations near you."));

    }
}
