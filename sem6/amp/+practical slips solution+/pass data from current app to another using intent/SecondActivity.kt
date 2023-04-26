package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedIntent = intent
        val receivedText = receivedIntent.getStringExtra(Intent.EXTRA_TEXT)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = receivedText
    }
}
