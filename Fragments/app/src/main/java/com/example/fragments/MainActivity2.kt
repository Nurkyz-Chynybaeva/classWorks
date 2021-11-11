package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_main2)
    }

    override fun onClicked(text: String) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.secondFragmen) as? Fragment2
        fragment2?.setValue(text)
        val fragment1 = supportFragmentManager.findFragmentById(R.id.firstFragmen) as? Fragment1
        fragment1?.setValue(text)
    }

}