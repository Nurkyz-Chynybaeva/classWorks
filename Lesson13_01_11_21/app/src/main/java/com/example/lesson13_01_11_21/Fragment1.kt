package com.example.lesson13_01_11_21

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1){

    private lateinit var txt:AppCompatTextView
    private lateinit var listener: OnButtonClicked

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt = view.findViewById(R.id.txt_fragment)

        val editF = view.findViewById<AppCompatEditText>(R.id.edit_fragment)
        val btnF = view.findViewById<AppCompatButton>(R.id.btn_fragment)

      btnF.setOnClickListener{
//       val listener = activity as OnButtonClicked
//            listener?.onButtonClicked(editF.text.toString())

//            if (listener != null){
     listener.onButtonClicked(editF.text.toString())
         //  }
        }

    }

    fun setText(enteredText:String){
    txt.text = enteredText
    }


//    override fun onAttach(context: Context){       // этот метод вызывается тогда, когда фрагмент привязывается к activity
//        super.onAttach(context)
//        Log.e(TAG, "onAttach")
//    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.e(TAG, "onCreate")
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        Log.e(TAG, "onCreateView")
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        Log.e(TAG, "onViewCreated")
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.e(TAG, "onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e(TAG, "onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e(TAG, "onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e(TAG, "onStop")
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        Log.e(TAG, "onDestroyView")
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e(TAG, "onDestroy")
//    }
//
//    override fun onDetach() {                       // этот метод вызывается тогда, когда фрагмент отвязывается от activity
//        super.onDetach()
//        Log.e(TAG, "onDetach")
//    }
//    companion object{
//        const val TAG = "Fragment1"
//    }




}





