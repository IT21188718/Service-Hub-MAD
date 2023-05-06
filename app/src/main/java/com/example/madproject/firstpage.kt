package com.example.madproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstpage : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        var username = findViewById<Button>(R.id.username)
        username.setOnClickListener{
            val intent = Intent(this,add_cusdetails::class.java)
            startActivity(intent    )
        }
        var password = findViewById<Button>(R.id.password)
        password.setOnClickListener{
            val intent = Intent(this,add_emp_details::class.java)
            startActivity(intent    )
        }
    }
}