package com.example.kidzone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;


import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    Button playingButton;
    Button learningButton;
    Button tr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        auth = FirebaseAuth.getInstance();

        playingButton=findViewById(R.id.PlayingButton);
        learningButton = findViewById(R.id.LearningButton);
        tr = findViewById(R.id.buttonTR);

        playingButton.setOnClickListener( v -> openPlayingActivity());
        learningButton.setOnClickListener( v -> openLearningActivity());
        tr.setOnClickListener(v-> openHomeTrActivity());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //bağlama işlemini yapıyoz böyle
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //seçince nolcağını yazıyoz
        if(item.getItemId() == R.id.signout) {
            auth.signOut();
            Intent intentToMain = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intentToMain);
            finish();
        }
        /*else if (item.getItemId() == R.id.profile) {
            Intent intentToProfile = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intentToProfile);
            finish();

        }*/
            return super.onOptionsItemSelected(item);
    }

    private void openPlayingActivity(){
        Intent intent = new Intent(HomeActivity.this, PlayingActivity.class);
        startActivity(intent);
    }
    private void openLearningActivity(){
        Intent intent = new Intent(HomeActivity.this, LearningActivity.class);
        startActivity(intent);
    }

    private void openHomeTrActivity(){
        Intent intent = new Intent(HomeActivity.this, HomeActivityTR.class);
        startActivity(intent);
    }
}