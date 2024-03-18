package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LearningActivity extends AppCompatActivity {
    Button seasonsButton;
    Button daysButton;
    Button monthsButton;
    Button directionsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        seasonsButton=findViewById(R.id.SeasonsButton);
        seasonsButton.setOnClickListener(v->openSeasonsActivity());

        daysButton = findViewById(R.id.DaysButton);
        daysButton.setOnClickListener(v -> openDaysActivity());

        monthsButton = findViewById(R.id.MonthsButton);
        monthsButton.setOnClickListener(v -> openMonthsActivity());

        directionsButton = findViewById(R.id.DirectionsButton);
        directionsButton.setOnClickListener(v -> openDirectionsActivity());
    }

    private void openSeasonsActivity(){
        Intent intent = new Intent(LearningActivity.this, SeasonsLearningActivity.class);
        startActivity(intent);
    }
    private void openDaysActivity(){
        Intent intent = new Intent(LearningActivity.this, DaysLearningActivity.class);
        startActivity(intent);
    }
    private void openMonthsActivity(){
        Intent intent = new Intent(LearningActivity.this, MonthsLearningActivity.class);
        startActivity(intent);
    }
    private void openDirectionsActivity(){
        Intent intent = new Intent(LearningActivity.this, DirectionsLearningActivity.class);
        startActivity(intent);
    }
}