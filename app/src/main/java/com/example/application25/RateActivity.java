package com.example.application25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        RatingBar r_bar;
        Button submit_button;
        r_bar=findViewById(R.id.ratingBar);
        submit_button=findViewById(R.id.submit);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st= String.valueOf(r_bar.getRating());
                Toast.makeText(getApplicationContext(),st+"Star",Toast.LENGTH_LONG).show();
            }
        });
    }
}