package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SeasonsPlayingActivityTR extends AppCompatActivity {

    Button true1btnTR;
    Button true2btnTR;
    Button true3btnTR;
    Button true4btnTR;
    Button false1btnTR;
    Button false2btnTR;
    Button false3btnTR;
    Button false4btnTR;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_playing_tr);

        true1btnTR = findViewById(R.id.true1ButtonTR);
        true2btnTR = findViewById(R.id.true2ButtonTR);
        true3btnTR = findViewById(R.id.true3ButtonTR);
        true4btnTR = findViewById(R.id.true4ButtonTR);

        false1btnTR=findViewById(R.id.false1ButtonTR);
        false2btnTR=findViewById(R.id.false2ButtonTR);
        false3btnTR=findViewById(R.id.false3ButtonTR);
        false4btnTR=findViewById(R.id.false4ButtonTR);

        true1btnTR.setOnClickListener(v->createTrueMessage());
        true2btnTR.setOnClickListener(v->createTrueMessage());
        true3btnTR.setOnClickListener(v->createTrueMessage());
        true4btnTR.setOnClickListener(v->createTrueMessage());

        false1btnTR.setOnClickListener(v->createFalseMessage());
        false2btnTR.setOnClickListener(v->createFalseMessage());
        false3btnTR.setOnClickListener(v->createFalseMessage());
        false4btnTR.setOnClickListener(v->createFalseMessage());
    }
    private void createTrueMessage(){
        String trueMessage = "DOĞRU";
        Toast toast = Toast.makeText(this, trueMessage, Toast.LENGTH_SHORT);
        toast.show();

    }
    private void createFalseMessage(){
        String falseMessage = "YANLIŞ";
        Toast toast = Toast.makeText(this, falseMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}