package com.example.android_ktx

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetText")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button)
            .setOnClickListener {
            lifecycleScope.launch {
                delay(3000)
                findViewById<TextView>(R.id.textView).text = "good night world"
            }
        }
    }
}