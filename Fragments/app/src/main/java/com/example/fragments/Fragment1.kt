package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1){
    private lateinit var listener: OnClickListener
private lateinit var txt : AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
txt= view.findViewById(R.id.fragmentText1)
        val fragBtn1 = view.findViewById<AppCompatButton>(R.id.fragment1Btn)
        fragBtn1.setOnClickListener{
listener.onClicked("aaaaa")
        }

    }


    fun setValue(value: String) {
        txt.text = value
    }

}
