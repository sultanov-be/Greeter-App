package com.example.greeterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.greet_button).setOnClickListener {
            addName(it)
        }
    }

    fun addName(view: View) {
        val greeterText = findViewById<TextView>(R.id.greeter_text)


        greeterText.text = "Hello, "  + findViewById<EditText>(R.id.edit_text).getText().toString() + "!"
        greeterText.visibility = View.VISIBLE
    }
}