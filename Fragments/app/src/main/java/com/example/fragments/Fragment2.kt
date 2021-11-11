package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment2) {
    private lateinit var txt : AppCompatTextView
    private lateinit var listener: OnClickListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt= view.findViewById(R.id.fragment2Text)
        val fragBtn2 = view.findViewById<AppCompatButton>(R.id.fragment2Btn)
        fragBtn2.setOnClickListener {
listener.onClicked("bbbbb")
        }

    }
    fun setValue(value: String){
        txt.text = value
    }
}