package com.example.android.lesson12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Hello World");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
