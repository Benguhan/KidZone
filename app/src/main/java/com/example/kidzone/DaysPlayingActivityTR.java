package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DaysPlayingActivityTR extends AppCompatActivity {

    Button correct1btnTR;
    Button correct2btnTR;
    Button correct3btnTR;
    Button correct4btnTR;
    Button correct5btnTR;
    Button correct6btnTR;
    Button fls1btnTR;
    Button fls2btnTR;
    Button fls3btnTR;
    Button fls4btnTR;
    Button fls5btnTR;
    Button fls6btnTR;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_playing_tr);

        correct1btnTR = findViewById(R.id.correct1ButtonTR);
        correct2btnTR = findViewById(R.id.correct2ButtonTR);
        correct3btnTR = findViewById(R.id.correct3ButtonTR);
        correct4btnTR = findViewById(R.id.correct4ButtonTR);
        correct5btnTR = findViewById(R.id.correct5ButtonTR);
        correct6btnTR = findViewById(R.id.correct6ButtonTR);

        fls1btnTR = findViewById(R.id.fls1ButtonTR);
        fls2btnTR = findViewById(R.id.fls2ButtonTR);
        fls3btnTR = findViewById(R.id.fls3ButtonTR);
        fls4btnTR = findViewById(R.id.fls4ButtonTR);
        fls5btnTR = findViewById(R.id.fls5ButtonTR);
        fls6btnTR = findViewById(R.id.fls6ButtonTR);

        correct1btnTR.setOnClickListener(v -> createTrueMessage());
        correct2btnTR.setOnClickListener(v -> createTrueMessage());
        correct3btnTR.setOnClickListener(v -> createTrueMessage());
        correct4btnTR.setOnClickListener(v -> createTrueMessage());
        correct5btnTR.setOnClickListener(v -> createTrueMessage());
        correct6btnTR.setOnClickListener(v -> createTrueMessage());

        fls1btnTR.setOnClickListener(v -> createFalseMessage());
        fls2btnTR.setOnClickListener(v -> createFalseMessage());
        fls3btnTR.setOnClickListener(v -> createFalseMessage());
        fls4btnTR.setOnClickListener(v -> createFalseMessage());
        fls5btnTR.setOnClickListener(v -> createFalseMessage());
        fls6btnTR.setOnClickListener(v -> createFalseMessage());
    }
    private void createTrueMessage() {
        String trueMessage = "DOĞRU";
        Toast toast = Toast.makeText(this, trueMessage, Toast.LENGTH_SHORT);
        toast.show();
    }


    private void createFalseMessage() {
        String falseMessage = "YANLIŞ";
        Toast toast = Toast.makeText(this, falseMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}