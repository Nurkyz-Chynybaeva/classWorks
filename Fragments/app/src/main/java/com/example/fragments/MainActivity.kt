package com.example.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var txt1: AppCompatTextView
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragments()
        txt1 = findViewById(R.id.txt1)
        layout = findViewById(R.id.layout)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)

        btn1.setOnClickListener {
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment1!!)
                .hide(fragment2!!)
                .commit()
        }

        btn2.setOnClickListener {
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment2!!)
                .hide(fragment1!!)
                .commit()
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    private fun initFragments() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, Fragment1(), "fragment1")
            .addToBackStack(null)
            .commit()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, Fragment2(), "fragment2")
            .addToBackStack(null)
            .commit()
    }

    override fun onClicked(text: String) {
        // ---
    }
}