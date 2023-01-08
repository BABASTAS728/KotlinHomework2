package com.example.homework2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val count = findViewById<TextView>(R.id.count)
        textView.setOnClickListener{
            count.text = (Integer.parseInt(count.text as String) +1).toString();
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val secondIntent = Intent(this, SecondActivity::class.java)
            secondIntent.putExtra("TOTAL_COUNT", Integer.parseInt(count.text as String))
            startActivity(secondIntent)
        }
    }
}