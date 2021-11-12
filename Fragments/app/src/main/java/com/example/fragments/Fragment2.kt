package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn2 = view.findViewById<AppCompatButton>(R.id.f2btn)
        btn2.setOnClickListener{
            Toast.makeText(requireContext(), "This is Fragment 2 !!!", Toast.LENGTH_SHORT).show()

        }
    }

    companion object{
        const val TAG = "Fragment 2"
    }
}