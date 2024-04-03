package com.example.doji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mops_spelling_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mops_spelling_task);
    }

    public void correct_mops (View v) {    Intent intent = new Intent(this,mops_spelling_task_correct.class);
        startActivity(intent);}

    public void incorrect_mops_black (View v) {    Intent intent = new Intent(this,mops_spelling_task_incorrect_black.class);
        startActivity(intent);}
    public void incorrect_mops_doc (View v) {    Intent intent = new Intent(this,mops_spelling_task_incorrect_doc.class);
        startActivity(intent);}
    public void incorrect_mops_dof (View v) {    Intent intent = new Intent(this,mops_spelling_task_incorrect_dof.class);
        startActivity(intent);}
}