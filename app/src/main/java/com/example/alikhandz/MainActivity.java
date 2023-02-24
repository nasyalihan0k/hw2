package com.example.alikhandz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button plus_btn;
    private Button minus_btn;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus_btn = findViewById(R.id.plus_btn);
        result = findViewById(R.id.result);
        minus_btn = findViewById(R.id.minus_btn);

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter --;
                result.setText(String.valueOf(counter));
            }
        });

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                result.setText(String.valueOf(counter));
            }


        });
    }

}