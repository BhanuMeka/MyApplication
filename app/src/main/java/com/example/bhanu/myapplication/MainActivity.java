package com.example.bhanu.myapplication;
import android.util.Log;
import android.view.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public void button(View view)
    {
        Log.i("Info","Button Pressed!");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
