package com.example.android_31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button num9;
    private Button num8;
    private Button num7;
    private Button num6;
    private Button num5;
    private Button num4;
    private Button num3;
    private Button num2;
    private Button num1;
    private Button num0;
    private Button numDot;
    private TextView calcScreen;
    private StringBuffer inputSequence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("9");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("8");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("7");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("6");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("5");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("4");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("3");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("2");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("1");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("0");
            }
        });
        numDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(".");
            }
        });
    }

    private void initView() {
        num9 = findViewById(R.id.btn_9);
        num8 = findViewById(R.id.btn_8);
        num7 = findViewById(R.id.btn_7);
        num6 = findViewById(R.id.btn_6);
        num5 = findViewById(R.id.btn_5);
        num4 = findViewById(R.id.btn_4);
        num3 = findViewById(R.id.btn_3);
        num2 = findViewById(R.id.btn_2);
        num1 = findViewById(R.id.btn_1);
        num0 = findViewById(R.id.btn_0);
        numDot = findViewById(R.id.btn_dot);
        calcScreen = findViewById(R.id.calc_screen);
    }
}