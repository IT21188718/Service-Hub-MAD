package com.example.madproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class appointment_editpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment_editpage)

        var button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener{
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }
        var button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener{
            val intent = Intent(this,cfmmessage::class.java)
            startActivity(intent)
        }
    }
}