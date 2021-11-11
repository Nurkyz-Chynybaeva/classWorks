package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn1 = view.findViewById<AppCompatButton>(R.id.btn1)
        btn1.setOnClickListener{
            Toast.makeText(requireContext(), "This is Fragment 1 !!!", Toast.LENGTH_SHORT)

        }
    }

}