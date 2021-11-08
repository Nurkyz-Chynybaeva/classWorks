package com.example.lesson13_01_11_21

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {
    private lateinit var txt : AppCompatTextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt = view.findViewById(R.id.firstFragment_btn2)
    }

    fun setText(value:String){
  txt.text = value
    }

}