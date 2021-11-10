package com.example.fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragBtn1 = view.findViewById<AppCompatButton>(R.id.fragment1Btn)
        fragBtn1.setOnClickListener{

        }

    }
}
