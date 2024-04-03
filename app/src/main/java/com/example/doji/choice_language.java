package com.example.doji;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choice_language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_language);
    }


    public void go_main (View v) {    Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);}


    public void showNotAvailableDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Приложение находится в разработке, скоро все заработает!")
                .setPositiveButton("OK", null); // Кнопка "OK" для закрытия диалога

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void selected(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("У вас уже выбран этот язык, изучайте!")
                .setPositiveButton("OK", null); // Кнопка "OK" для закрытия диалога

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}