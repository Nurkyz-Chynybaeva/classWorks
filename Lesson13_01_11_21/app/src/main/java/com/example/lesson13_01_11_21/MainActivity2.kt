package com.example.lesson13_01_11_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity2 : AppCompatActivity(), OnButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragment_container, Fragment())
//            .commit()
    }

    override fun onButtonClicked(enteredText: String) {
    val fragment2 = supportFragmentManager.findFragmentById(R.id.secondFragment) as SecondFragment
        fragment2.setText(enteredText)
    }
}