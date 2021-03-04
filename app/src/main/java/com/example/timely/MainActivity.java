package com.example.timely;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button record1;
    Button record2;
    TextView recorded1;
    TextView recorded2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        record1 = findViewById(R.id.recordButton);
        record2 = findViewById(R.id.recordButton2);
        recorded1 = findViewById(R.id.recordedTimes);
        recorded2 = findViewById(R.id.recordedTimes2);
    }


}