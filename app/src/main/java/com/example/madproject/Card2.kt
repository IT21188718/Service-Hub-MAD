package com.example.madproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Card2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card2)

        var pay_button = findViewById<Button>(R.id.pay_button)
        pay_button.setOnClickListener {
            val intent = Intent(this, appointment_editpage::class.java)
            startActivity(intent)

        }
        }
}