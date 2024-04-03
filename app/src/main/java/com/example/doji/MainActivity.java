package com.example.doji;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void language_choice (View v) {    Intent intent = new Intent(this,choice_language.class);
        startActivity(intent);}


    public void statisticsssss (View v) {    Intent intent = new Intent(this,statistics.class);
        startActivity(intent);}

    public void avatar (View v) {    Intent intent = new Intent(this,choice_avatar.class);
        startActivity(intent);}



    public void showNotAvailableDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Приложение находится в разработке, скоро все заработает!")
                .setPositiveButton("OK", null); // Кнопка "OK" для закрытия диалога

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}


