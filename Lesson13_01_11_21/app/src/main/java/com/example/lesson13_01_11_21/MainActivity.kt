package com.example.lesson13_01_11_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMain = findViewById<AppCompatButton>(R.id.btn_main)
        btnMain.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }


    }
}