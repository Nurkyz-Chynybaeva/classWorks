package com.example.fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment2) {
//
//    private lateinit var text2: AppCompatTextView
//    private lateinit var layout2 : ConstraintLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragBtn2 = view.findViewById<AppCompatButton>(R.id.fragment2Btn)
        fragBtn2.setOnClickListener {

        }

    }
}