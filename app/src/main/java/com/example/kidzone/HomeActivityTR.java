package com.example.kidzone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;


import com.google.firebase.auth.FirebaseAuth;

public class HomeActivityTR extends AppCompatActivity {
    private FirebaseAuth auth;
    Button playingBtn2;
    Button learningBtn2;
    Button ing;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_tr);

        auth = FirebaseAuth.getInstance();

        playingBtn2 = findViewById(R.id.PlayingButton2);
        learningBtn2 = findViewById(R.id.LearningButton2);
        ing = findViewById(R.id.buttonING);


        playingBtn2.setOnClickListener( v -> openPlayingActivity2());
        learningBtn2.setOnClickListener( v -> openLearningActivity2());
        ing.setOnClickListener(v-> openHomeINGActivity());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //bağlama işlemini yapıyoz böyle
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu_tr, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //seçince nolcağını yazıyoz
        if(item.getItemId() == R.id.signout) {
            auth.signOut();
            Intent intentToMain = new Intent(HomeActivityTR.this, MainActivity.class);
            startActivity(intentToMain);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void openPlayingActivity2(){
        Intent intent = new Intent(HomeActivityTR.this, PlayingActivityTR.class);
        startActivity(intent);
    }
    private void openLearningActivity2(){
        Intent intent = new Intent(HomeActivityTR.this, LearningActivityTR.class);
        startActivity(intent);
    }
    private void openHomeINGActivity(){
        Intent intent = new Intent(HomeActivityTR.this, HomeActivity.class);
        startActivity(intent);
    }

}