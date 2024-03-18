package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LearningActivityTR extends AppCompatActivity {

    Button seasonsButtonTR;
    Button daysButtonTR;
    Button monthsButtonTR;
    Button directionsButtonTR;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_tr);

        seasonsButtonTR=findViewById(R.id.SeasonsButtonTR);
        seasonsButtonTR.setOnClickListener(v->openSeasonsActivityTR());

        daysButtonTR = findViewById(R.id.DaysButtonTR);
        daysButtonTR.setOnClickListener(v -> openDaysActivityTR());

        monthsButtonTR = findViewById(R.id.MonthsButtonTR);
        monthsButtonTR.setOnClickListener(v -> openMonthsActivityTR());

        directionsButtonTR = findViewById(R.id.DirectionsButtonTR);
        directionsButtonTR.setOnClickListener(v -> openDirectionsActivityTR());
    }
    private void openSeasonsActivityTR(){
        Intent intent = new Intent(LearningActivityTR.this, SeasonsLearningActivityTR.class);
        startActivity(intent);
    }
    private void openDaysActivityTR(){
        Intent intent = new Intent(LearningActivityTR.this, DaysLearningActivityTR.class);
        startActivity(intent);
    }
    private void openMonthsActivityTR(){
        Intent intent = new Intent(LearningActivityTR.this, MonthsLearningActivityTR.class);
        startActivity(intent);
    }
    private void openDirectionsActivityTR(){
        Intent intent = new Intent(LearningActivityTR.this, DirectionsLearningActivityTR.class);
        startActivity(intent);
    }
}