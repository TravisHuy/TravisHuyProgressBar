package com.nhathuy.travishuyprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TravisHuyProgressBar progressBar= findViewById(R.id.progress_bar);
        progressBar.setBackgroundColor(Color.GRAY);

// Cập nhật tiến trình
        progressBar.setProgress(90);
        progressBar.setMax(100);
    }
}