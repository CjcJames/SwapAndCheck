package com.swapandchecker.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessage extends AppCompatActivity {
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent getint = getIntent();
        String f = getint.getStringExtra("firstword");
        String s = getint.getStringExtra("secondword");
        res = findViewById(R.id.tvResult);
        if (s.equals(f)){
            res.setText("THE SAME");
        }
        else {
            res.setText("NOT THE SAME");
        }


    }
}