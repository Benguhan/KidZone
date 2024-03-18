package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DirectionsPlayingActivity extends AppCompatActivity {

    Button trButt1;
    Button trButt2;
    Button trButt3;
    Button trButt4;
    Button trButt5;
    Button trButt6;
    Button trButt7;

    Button flsButt1;
    Button flsButt2;
    Button flsButt3;
    Button flsButt4;
    Button flsButt5;
    Button flsButt6;
    Button flsButt7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions_playing);

        trButt1 = findViewById(R.id.trueButt1);
        trButt2 = findViewById(R.id.trueButt2);
        trButt3 = findViewById(R.id.trueButt3);
        trButt4 = findViewById(R.id.trueButt4);
        trButt5 = findViewById(R.id.trueButt5);
        trButt6 = findViewById(R.id.trueButt6);
        trButt7 = findViewById(R.id.trueButt7);

        flsButt1 = findViewById(R.id.falseButt1);
        flsButt2 = findViewById(R.id.falseButt2);
        flsButt3 = findViewById(R.id.falseButt3);
        flsButt4 = findViewById(R.id.falseButt4);
        flsButt5 = findViewById(R.id.falseButt5);
        flsButt6 = findViewById(R.id.falseButt6);
        flsButt7 = findViewById(R.id.falseButt7);

        trButt1.setOnClickListener(v -> createTrueMessage());
        trButt2.setOnClickListener(v -> createTrueMessage());
        trButt3.setOnClickListener(v -> createTrueMessage());
        trButt4.setOnClickListener(v -> createTrueMessage());
        trButt5.setOnClickListener(v -> createTrueMessage());
        trButt6.setOnClickListener(v -> createTrueMessage());
        trButt7.setOnClickListener(v -> createTrueMessage());

        flsButt1.setOnClickListener(v -> createFalseMessage());
        flsButt2.setOnClickListener(v -> createFalseMessage());
        flsButt3.setOnClickListener(v -> createFalseMessage());
        flsButt4.setOnClickListener(v -> createFalseMessage());
        flsButt5.setOnClickListener(v -> createFalseMessage());
        flsButt6.setOnClickListener(v -> createFalseMessage());
        flsButt7.setOnClickListener(v -> createFalseMessage());

    }

    private void createTrueMessage() {
        String trueMessage = "CORRECT";
        Toast toast = Toast.makeText(this, trueMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void createFalseMessage() {
        String falseMessage = "FALSE";
        Toast toast = Toast.makeText(this, falseMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}