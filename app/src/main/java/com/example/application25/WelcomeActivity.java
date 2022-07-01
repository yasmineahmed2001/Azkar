package com.example.application25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView image_welcome=findViewById(R.id.image_welcome);
        Thread thr=new Thread(){
            public void run(){
                try {
                    sleep(2600);
                    Intent act=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(act);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thr.start();
    }
}
