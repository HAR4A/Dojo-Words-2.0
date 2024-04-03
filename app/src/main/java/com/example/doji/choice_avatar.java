package com.example.doji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choice_avatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_avatar);
    }
    public void go_main (View v) {    Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);}
}