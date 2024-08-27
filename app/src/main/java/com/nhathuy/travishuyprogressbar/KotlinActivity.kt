package com.nhathuy.travishuyprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val progressBar: TravisHuyProgressBar = findViewById(R.id.progressBar)
        // Set progress programmatically
        progressBar.progress = 80

        // Set the maximum value
        progressBar.max = 100

    }
}