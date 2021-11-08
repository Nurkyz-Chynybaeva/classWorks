package com.example.lesson13_01_11_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), OnButtonClicked{
    private lateinit var txtM: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()

        txtM= findViewById(R.id.txt_main)
        val edit = findViewById<AppCompatEditText>(R.id.edit_main)
        val btnMain = findViewById<AppCompatButton>(R.id.btn_main)

//        btnMain.setOnClickListener{
//        val fragment1 = supportFragmentManager.findFragmentById(R.id.fragment_intoThe_MainActivity) as? Fragment1
//            fragment1?.setText(edit.text.toString())
////            startActivity(Intent(this, MainActivity2::class.java))             13th lesson
//        }
        btnMain.setOnClickListener{
      val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

   override fun onButtonClicked(enteredText: String){
        txtM.text = enteredText
    }

    private fun initFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_intoThe_MainActivity, Fragment1())
            .commit()

    }

}