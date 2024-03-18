package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.Toast;



public class MonthsPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_playing);

        final EditText edittext = findViewById(R.id.January);
        edittext.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext.getText().toString().equals("January")||edittext.getText().toString().equals("january")||edittext.getText().toString().equals("JANUARY")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext2 = findViewById(R.id.October);
        edittext2.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext2.getText().toString().equals("October")||edittext2.getText().toString().equals("october")||edittext2.getText().toString().equals("OCTOBER")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext3 = findViewById(R.id.June);
        edittext3.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext3.getText().toString().equals("June")||edittext3.getText().toString().equals("june")||edittext3.getText().toString().equals("JUNE")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext4 = findViewById(R.id.Twelve);
        edittext4.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext4.getText().toString().equals("Twelve")||edittext4.getText().toString().equals("twelve")||edittext4.getText().toString().equals("12")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext5 = findViewById(R.id.December);
        edittext5.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext5.getText().toString().equals("December")||edittext5.getText().toString().equals("december")||edittext5.getText().toString().equals("DECEMBER")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });
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