package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PlayingActivity extends AppCompatActivity {
    Button seasonsGButton;
    Button daysGButton;
    Button monthsGButton;
    Button directionsGButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        seasonsGButton=findViewById(R.id.SeasonsGButton);
        seasonsGButton.setOnClickListener(v->openSeasonsGActivity());

        daysGButton = findViewById(R.id.DaysGButton);
        daysGButton.setOnClickListener(v -> openDaysGActivity());

        monthsGButton = findViewById(R.id.MonthsGButton);
        monthsGButton.setOnClickListener(v -> openMonthsGActivity());

        directionsGButton = findViewById(R.id.DirectionsGButton);
        directionsGButton.setOnClickListener(v -> openDirectionsGActivity());
    }
    private void openSeasonsGActivity(){
        Intent intent = new Intent(PlayingActivity.this, SeasonsPlayingActivity.class);
        startActivity(intent);
    }
    private void openDaysGActivity(){
        Intent intent = new Intent(PlayingActivity.this, DaysPlayingActivity.class);
        startActivity(intent);
    }
    private void openMonthsGActivity(){
        Intent intent = new Intent(PlayingActivity.this, MonthsPlayingActivity.class);
        startActivity(intent);
    }
    private void openDirectionsGActivity(){
        Intent intent = new Intent(PlayingActivity.this, DirectionsPlayingActivity.class);
        startActivity(intent);
    }
}