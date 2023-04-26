package com.example.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirm exit")
        builder.setMessage("Are you sure you want to exit?")
        builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
            // Close the activity
            finish()
        })
        builder.setNegativeButton("No", null)
        val dialog = builder.create()
        dialog.show()
    }
}
