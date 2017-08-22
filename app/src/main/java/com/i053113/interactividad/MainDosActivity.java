package com.i053113.interactividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainDosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);
    }

    public void goActivity(View v) {
        Intent uno = new Intent(this, MainActivity.class);
        startActivity(uno);
    }

}