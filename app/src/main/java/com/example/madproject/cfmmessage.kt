package com.example.madproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cfmmessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cfmmessage)

        var button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener{
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }
    }
}