package com.example.madproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton


class Card1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card1)

        var btnPay = findViewById<Button>(R.id.btnPay)
        btnPay.setOnClickListener{
            val intent = Intent(this,Card2::class.java)
            startActivity(intent    )
        }
        var btnPay2 = findViewById<Button>(R.id.btnPay2)
        btnPay2.setOnClickListener{
            val intent = Intent(this,Card2::class.java)
            startActivity(intent    )
        }
    }
}