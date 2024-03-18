package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SeasonsPlayingActivity extends AppCompatActivity {

    Button true1btn;
    Button true2btn;
    Button true3btn;
    Button true4btn;
    Button false1btn;
    Button false2btn;
    Button false3btn;
    Button false4btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_playing);

        true1btn = findViewById(R.id.true1Button);
        true2btn = findViewById(R.id.true2Button);
        true3btn = findViewById(R.id.true3Button);
        true4btn = findViewById(R.id.true4Button);

        false1btn=findViewById(R.id.false1Button);
        false2btn=findViewById(R.id.false2Button);
        false3btn=findViewById(R.id.false3Button);
        false4btn=findViewById(R.id.false4Button);

        true1btn.setOnClickListener(v->createTrueMessage());
        true2btn.setOnClickListener(v->createTrueMessage());
        true3btn.setOnClickListener(v->createTrueMessage());
        true4btn.setOnClickListener(v->createTrueMessage());

        false1btn.setOnClickListener(v->createFalseMessage());
        false2btn.setOnClickListener(v->createFalseMessage());
        false3btn.setOnClickListener(v->createFalseMessage());
        false4btn.setOnClickListener(v->createFalseMessage());
    }

    private void createTrueMessage(){
        String trueMessage = "CORRECT";
        Toast toast = Toast.makeText(this, trueMessage, Toast.LENGTH_SHORT);
        toast.show();

    }
    private void createFalseMessage(){
        String falseMessage = "FALSE";
        Toast toast = Toast.makeText(this, falseMessage, Toast.LENGTH_SHORT);
        toast.show();
    }



}