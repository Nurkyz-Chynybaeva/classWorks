package com.example.fragments

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.graphics.Insets.add
import androidx.core.view.OneShotPreDrawListener.add

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<AppCompatTextView>(R.id.btn1)
        val btn2 = findViewById<AppCompatTextView>(R.id.btn2)
        val btn3 = findViewById<AppCompatTextView>(R.id.btn3)

        btn1.setOnClickListener{

        }

     fun onClick (v: View){
         val transaction = supportFragmentManager.beginTransaction()

            when(v.id){
                R.id.btn1 -> {

                }


            }
        }
    }
}