package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PlayingActivityTR extends AppCompatActivity {
    Button seasonsGButtonTr;
    Button daysGButtonTr;
    Button monthsGButtonTr;
    Button directionsGButtonTr;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_tr);

        seasonsGButtonTr=findViewById(R.id.SeasonsGButtonTR);
        seasonsGButtonTr.setOnClickListener(v->openSeasonsGActivityTR());

        daysGButtonTr = findViewById(R.id.DaysGButtonTR);
        daysGButtonTr.setOnClickListener(v -> openDaysGActivityTR());

        monthsGButtonTr = findViewById(R.id.MonthsGButtonTR);
        monthsGButtonTr.setOnClickListener(v -> openMonthsGActivityTR());

        directionsGButtonTr = findViewById(R.id.DirectionsGButtonTR);
        directionsGButtonTr.setOnClickListener(v -> openDirectionsGActivityTR());
    }
    private void openSeasonsGActivityTR(){
        Intent intent = new Intent(PlayingActivityTR.this, SeasonsPlayingActivityTR.class);
        startActivity(intent);
    }
    private void openDaysGActivityTR(){
        Intent intent = new Intent(PlayingActivityTR.this, DaysPlayingActivityTR.class);
        startActivity(intent);
    }
    private void openMonthsGActivityTR(){
        Intent intent = new Intent(PlayingActivityTR.this, MonthsPlayingActivityTR.class);
        startActivity(intent);
    }
    private void openDirectionsGActivityTR(){
        Intent intent = new Intent(PlayingActivityTR.this, DirectionsPlayingActivityTR.class);
        startActivity(intent);
    }
}