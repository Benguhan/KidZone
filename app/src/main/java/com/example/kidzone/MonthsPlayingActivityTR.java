package com.example.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.Toast;

public class MonthsPlayingActivityTR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_playing_tr);

        final EditText edittextTR = findViewById(R.id.JanuaryTR);
        edittextTR.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittextTR.getText().toString().equals("Ocak")||edittextTR.getText().toString().equals("ocak")||edittextTR.getText().toString().equals("OCAK")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext2TR = findViewById(R.id.OctoberTR);
        edittext2TR.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext2TR.getText().toString().equals("Ekim")||edittext2TR.getText().toString().equals("ekim")||edittext2TR.getText().toString().equals("EKİM")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext3TR = findViewById(R.id.JuneTR);
        edittext3TR.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext3TR.getText().toString().equals("Haziran")||edittext3TR.getText().toString().equals("haziran")||edittext3TR.getText().toString().equals("HAZİRAN")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext4TR = findViewById(R.id.TwelveTR);
        edittext4TR.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext4TR.getText().toString().equals("On iki")||edittext4TR.getText().toString().equals("on iki")||edittext4TR.getText().toString().equals("12")||edittext4TR.getText().toString().equals("oniki")||edittext4TR.getText().toString().equals("Oniki")){
                    createTrueMessage();
                }
                else{
                    createFalseMessage();
                }
                return true;
            }
            return false;
        });

        final EditText edittext5TR = findViewById(R.id.DecemberTR);
        edittext5TR.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                if(edittext5TR.getText().toString().equals("Aralik")||edittext5TR.getText().toString().equals("aralik")||edittext5TR.getText().toString().equals("ARALIK")){
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