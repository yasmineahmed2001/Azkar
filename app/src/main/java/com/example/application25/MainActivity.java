package com.example.application25;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button f_B = findViewById(R.id.first_button);
        f_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first_int = new Intent(getApplicationContext(), azkar_muslim.class);
                startActivity(first_int);
            }
        });
        Button s_b = findViewById(R.id.sec_button);
        s_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second_int = new Intent(getApplicationContext(), azkari.class);
                startActivity(second_int);
            }
        });

        Button t_b = findViewById(R.id.thir_button);
        t_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thr_int = new Intent(getApplicationContext(), Sebha.class);
                startActivity(thr_int);
            }
        });

        ImageButton ab_button=findViewById(R.id.imageButton5);
        ab_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent six_int=new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(six_int);
            }
        });

        Button f_b = findViewById(R.id.fo_button);
        f_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent for_int = new Intent(getApplicationContext(), AsmaaAllah.class);
                startActivity(for_int);
            }
        });

        ImageButton ra_button=findViewById(R.id.imageButton4);
        ra_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sev_int=new Intent(getApplicationContext(), RateActivity.class);
                startActivity(sev_int);
            }
        });

    }
}
