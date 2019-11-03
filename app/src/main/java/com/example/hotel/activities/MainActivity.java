package com.example.hotel.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.hotel.fragments.BookFragment;
import com.example.hotel.fragments.HomeFragment;
import com.example.hotel.fragments.InviteFragment;
import com.example.hotel.R;
import com.example.hotel.fragments.SavedFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new HomeFragment());
        BottomNavigationView bottomNavView = findViewById(R.id.bottom_nav);
        bottomNavView.setOnNavigationItemSelectedListener(navListener);
    }

    public BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.nav_earn:
                    replaceFragment(new InviteFragment());
                    break;
                case R.id.nav_booking:
                    replaceFragment(new BookFragment());
                    break;
                case R.id.nav_saved:
                    replaceFragment(new SavedFragment());
                    break;
            }
            return true;
        }
    };
    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }
}
