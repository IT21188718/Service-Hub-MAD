package com.example.madproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton


class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var fix = findViewById<ImageButton>(R.id.fix)
        fix.setOnClickListener{
            val intent = Intent(this,Bookservice::class.java)
            startActivity(intent    )
        }

        var clean = findViewById<ImageButton>(R.id.clean)
        clean.setOnClickListener{
            val intent = Intent(this,Bookservice::class.java)
            startActivity(intent    )
        }

        var plumb = findViewById<ImageButton>(R.id.plumb)
        plumb.setOnClickListener{
            val intent = Intent(this,Bookservice::class.java)
            startActivity(intent    )
        }


        var repair = findViewById<ImageButton>(R.id.repair)
        repair.setOnClickListener{
            val intent = Intent(this,Bookservice::class.java)
            startActivity(intent    )
        }



    }
}