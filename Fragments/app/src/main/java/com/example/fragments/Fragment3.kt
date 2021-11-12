package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment3: Fragment(R.layout.fragment3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn3 = view.findViewById<AppCompatButton>(R.id.f3btn)
        btn3.setOnClickListener{
            Toast.makeText(requireContext(), "This is Fragment 3 !!!", Toast.LENGTH_SHORT).show()

        }
    }
    companion object{
        const val TAG = "Fragment 3"
    }
}