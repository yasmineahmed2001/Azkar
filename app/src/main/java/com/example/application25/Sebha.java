package com.example.application25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sebha extends AppCompatActivity {

    private TextView countertext, text1, text2, text3, text4, text5, text6;
    private Button plus8tn;
    private Button minus8tn;
    private Button reset8tn, backbtn;
    private int counter;
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.minus8tn:
                    minuscounter();
                    break;
                case R.id.reset8tn:
                    initcounter();
                    break;
                case R.id.plus8tn:
                    pluscounter();
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebha);
        countertext = (TextView) findViewById(R.id.countertext);
        plus8tn = (Button) findViewById(R.id.plus8tn);
        plus8tn.setOnClickListener(clickListener);
        minus8tn = (Button) findViewById(R.id.minus8tn);
        minus8tn.setOnClickListener(clickListener);
        reset8tn = (Button) findViewById(R.id.reset8tn);
        reset8tn.setOnClickListener(clickListener);

        backbtn = (Button) findViewById(R.id.button);
        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);
        text5 = (TextView) findViewById(R.id.textView5);
        text6 = (TextView) findViewById(R.id.textView6);

        initcounter();
    }

    private void initcounter() {
        counter = 0;
        countertext.setText(counter + "");
    }

    private void pluscounter() {
        counter++;
        countertext.setText(counter + "");
    }

    private void minuscounter() {
        if (counter == 0) {
            initcounter();
        } else {
            counter--;
            countertext.setText(counter + "");
        }
    }
}