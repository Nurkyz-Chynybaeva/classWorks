package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var text: AppCompatTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.txtMain)

        val btn1 = findViewById<AppCompatButton>(R.id.mbtn1)
        val btn2 = findViewById<AppCompatButton>(R.id.mbtn2)
        val btn3 = findViewById<AppCompatButton>(R.id.mbtn3)
        val btn4 = findViewById<AppCompatButton>(R.id.mbtn4)

        text.text = supportFragmentManager.backStackEntryCount.toString()
        supportFragmentManager.addOnBackStackChangedListener {
            text.text = supportFragmentManager.backStackEntryCount.toString()
        }
        btn1.setOnClickListener(::onClick)
        btn2.setOnClickListener(::onClick)
        btn3.setOnClickListener(::onClick)
        btn4.setOnClickListener{
            supportFragmentManager.popBackStack( 0, 0)
        }
    }

    private fun onClick(v: View) {
        val transaction = supportFragmentManager.beginTransaction()

        val pair = when (v.id) {
            R.id.mbtn1 -> {
          Fragment1() to Fragment1.TAG
            }
            R.id.mbtn2 -> {
               Fragment2() to  Fragment2.TAG
            }
            else -> {
              Fragment3() to  Fragment3.TAG
            }
        }


//        val fragmentFind = supportFragmentManager.findFragmentById(R.id.mainFragment)
//        if (fragmentFind != null){
//            transaction.remove(fragmentFind)
//        }
//        transaction.add(R.id.mainFragment, fragment)
//        transaction.addToBackStack(null)                                                   это одно и то же что replace
//        transaction.commit()


//        transaction.replace(R.id.mainFragment, fragment)
//        transaction.commit()

        transaction.add(R.id.mainFragment, pair.first, pair.second)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}












