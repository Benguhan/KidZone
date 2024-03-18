package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DirectionsPlayingActivityTR extends AppCompatActivity {

    Button trButt1TR;
    Button trButt2TR;
    Button trButt3TR;
    Button trButt4TR;
    Button trButt5TR;
    Button trButt6TR;
    Button trButt7TR;

    Button flsButt1TR;
    Button flsButt2TR;
    Button flsButt3TR;
    Button flsButt4TR;
    Button flsButt5TR;
    Button flsButt6TR;
    Button flsButt7TR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions_playing_tr);

        trButt1TR = findViewById(R.id.trueButt1TR);
        trButt2TR = findViewById(R.id.trueButt2TR);
        trButt3TR = findViewById(R.id.trueButt3TR);
        trButt4TR = findViewById(R.id.trueButt4TR);
        trButt5TR = findViewById(R.id.trueButt5TR);
        trButt6TR = findViewById(R.id.trueButt6TR);
        trButt7TR = findViewById(R.id.trueButt7TR);

        flsButt1TR = findViewById(R.id.falseButt1TR);
        flsButt2TR = findViewById(R.id.falseButt2TR);
        flsButt3TR = findViewById(R.id.falseButt3TR);
        flsButt4TR = findViewById(R.id.falseButt4TR);
        flsButt5TR = findViewById(R.id.falseButt5TR);
        flsButt6TR = findViewById(R.id.falseButt6TR);
        flsButt7TR = findViewById(R.id.falseButt7TR);

        trButt1TR.setOnClickListener(v -> createTrueMessage());
        trButt2TR.setOnClickListener(v -> createTrueMessage());
        trButt3TR.setOnClickListener(v -> createTrueMessage());
        trButt4TR.setOnClickListener(v -> createTrueMessage());
        trButt5TR.setOnClickListener(v -> createTrueMessage());
        trButt6TR.setOnClickListener(v -> createTrueMessage());
        trButt7TR.setOnClickListener(v -> createTrueMessage());

        flsButt1TR.setOnClickListener(v -> createFalseMessage());
        flsButt2TR.setOnClickListener(v -> createFalseMessage());
        flsButt3TR.setOnClickListener(v -> createFalseMessage());
        flsButt4TR.setOnClickListener(v -> createFalseMessage());
        flsButt5TR.setOnClickListener(v -> createFalseMessage());
        flsButt6TR.setOnClickListener(v -> createFalseMessage());
        flsButt7TR.setOnClickListener(v -> createFalseMessage());
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