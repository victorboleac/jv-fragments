package com.example.jv_fragments;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    NavigationBarView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    AddFragment addFragment = new AddFragment();
    FavouritesFragment favouritesFragment = new FavouritesFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.home){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, homeFragment)
                    .commit();
            return true;
        }
        if(item.getItemId()==R.id.add){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, addFragment)
                    .commit();
            return true;
        }
        if(item.getItemId()==R.id.favourites){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, favouritesFragment)
                    .commit();
            return true;
        }
        return false;
    }

}