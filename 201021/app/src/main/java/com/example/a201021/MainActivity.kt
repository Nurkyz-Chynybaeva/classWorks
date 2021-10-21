package com.example.a201021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
    }
        override fun onClick(view: View) {

      val msg=  when(view.id){
            R.id.btn1 -> "btn1"
            R.id.btn2 -> "btn2"
            R.id.btn3 -> "btn3"
          else -> "unknown"
        }
        val textV = findViewById<TextView>(R.id.text)
        textV.text = msg

        }



//    fun onClickEvent(view:View){                                         старый метод
//      val msg=  when(view.id){
//            R.id.btn1 -> "btn1"
//            R.id.btn2 -> "btn2"
//            R.id.btn3 -> "btn3"
//          else -> "unknown"
//        }
//        val textV = findViewById<TextView>(R.id.text)
//        textV.text = msg
//    }

}
