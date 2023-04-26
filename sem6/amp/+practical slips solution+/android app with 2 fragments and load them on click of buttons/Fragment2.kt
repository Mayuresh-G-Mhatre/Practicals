package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment2, container, false)

        // Set click listener for button
        val button = view.findViewById<Button>(R.id.button_fragment2)
        button.setOnClickListener {
            // Display toast with fragment name
            Toast.makeText(activity, "Fragment 2", Toast.LENGTH_SHORT).show()
        }

        // Set text for text view
        val textView = view.findViewById<TextView>(R.id.text_view_fragment2)
        textView.text = "Fragment 2"

        return view
    }
}
