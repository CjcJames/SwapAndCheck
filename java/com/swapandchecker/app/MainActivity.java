package com.swapandchecker.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button swap,check;
    EditText first,second;
    String f,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swap = findViewById(R.id.btnSwap);
        check = findViewById(R.id.btnCheck);
        first = findViewById(R.id.ettFirst);
        second = findViewById(R.id.ettSecond);

                swap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mswap();
            }
        });
        check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mcheck();
            }
        });
    }
    public void mswap(){
        f = first.getText().toString();
        s = second.getText().toString();

        first.setText(s);
        second.setText(f);
    }
    public void mcheck(){
        Intent intent = new Intent(this,MyMessage.class);
        intent.putExtra("firstword",first.getText().toString());
        intent.putExtra("secondword",second.getText().toString());
        startActivity(intent);
    }
}