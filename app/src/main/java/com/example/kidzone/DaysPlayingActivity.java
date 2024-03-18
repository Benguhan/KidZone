package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DaysPlayingActivity extends AppCompatActivity {

    Button correct1btn;
    Button correct2btn;
    Button correct3btn;
    Button correct4btn;
    Button correct5btn;
    Button correct6btn;
    Button fls1btn;
    Button fls2btn;
    Button fls3btn;
    Button fls4btn;
    Button fls5btn;
    Button fls6btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_playing);

        correct1btn = findViewById(R.id.correct1Button);
        correct2btn = findViewById(R.id.correct2Button);
        correct3btn = findViewById(R.id.correct3Button);
        correct4btn = findViewById(R.id.correct4Button);
        correct5btn = findViewById(R.id.correct5Button);
        correct6btn = findViewById(R.id.correct6Button);

        fls1btn = findViewById(R.id.fls1Button);
        fls2btn = findViewById(R.id.fls2Button);
        fls3btn = findViewById(R.id.fls3Button);
        fls4btn = findViewById(R.id.fls4Button);
        fls5btn = findViewById(R.id.fls5Button);
        fls6btn = findViewById(R.id.fls6Button);

        correct1btn.setOnClickListener(v -> createTrueMessage());
        correct2btn.setOnClickListener(v -> createTrueMessage());
        correct3btn.setOnClickListener(v -> createTrueMessage());
        correct4btn.setOnClickListener(v -> createTrueMessage());
        correct5btn.setOnClickListener(v -> createTrueMessage());
        correct6btn.setOnClickListener(v -> createTrueMessage());

        fls1btn.setOnClickListener(v -> createFalseMessage());
        fls2btn.setOnClickListener(v -> createFalseMessage());
        fls3btn.setOnClickListener(v -> createFalseMessage());
        fls4btn.setOnClickListener(v -> createFalseMessage());
        fls5btn.setOnClickListener(v -> createFalseMessage());
        fls6btn.setOnClickListener(v -> createFalseMessage());
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