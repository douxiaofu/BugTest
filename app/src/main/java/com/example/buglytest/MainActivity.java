package com.example.buglytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在这里toast一句话
        Toast.makeText(this, "今天是周二", Toast.LENGTH_SHORT).show();
        //
        //
        //
        Toast.makeText(this, "今天是周二", Toast.LENGTH_SHORT).show();

    }
}
