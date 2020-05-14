package com.submissionfikran.makanankhasindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tentang");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
