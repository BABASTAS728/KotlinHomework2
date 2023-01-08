package com.example.homework2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val count = intent.getIntExtra("TOTAL_COUNT",0)
        val countView = findViewById<TextView>(R.id.ValueFromMain)
         countView.text = countView.text as String  + " = " + count
    }
}