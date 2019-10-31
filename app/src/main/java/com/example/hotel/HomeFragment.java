package com.example.hotel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotel.Adapter.BookingAdapter;
import com.example.hotel.Adapter.HotelAdapter;
import com.example.hotel.Models.Booking;
import com.example.hotel.Models.Hotel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    HotelAdapter adapter;
    BookingAdapter bookingAdapter;
    ArrayList<Hotel> hotels=new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    RecyclerView recyclerView,recyclerViewBooking;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container,false);
        recyclerView=view.findViewById(R.id.recycle);
        recyclerViewBooking=view.findViewById(R.id.recyclev_booking);
        bookingAdapter=new BookingAdapter(bookings,getContext());
        adapter=new HotelAdapter(hotels,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));
        recyclerViewBooking.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        recyclerViewBooking.setAdapter(bookingAdapter);
        loaddata();
        return view;
    }
    private void loaddata() {
        hotels.add(new Hotel(R.drawable.hotel,"capita o","Premium Hotels with spacious rooms."));
        hotels.add(new Hotel(R.drawable.hotel,"Premium","Budget friendly hotels at prime location and premium amenities"));
        hotels.add(new Hotel(R.drawable.hotel,"Smart","Budget friendly hotels with basic amenities like clean linen, Wifi, TV etc."));
        bookings.add(new Booking("Party's \n not over yet!",R.drawable.hotel,"Find an oyo for your after-party."));
        bookings.add(new Booking("Nature \n at it's best",R.drawable.hotel,"Breathtaking views await you."));
        bookings.add(new Booking("Taking \n a business trip?",R.drawable.hotel,"Get an OYO in prime locations near you."));
    }
}
