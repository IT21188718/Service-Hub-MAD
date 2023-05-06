package com.example.madproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bookservice : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookservice)

        var book_button = findViewById<Button>(R.id.book_button)
        book_button.setOnClickListener{
            val intent = Intent(this,Card1::class.java)
            startActivity(intent    )
        }
    }
}