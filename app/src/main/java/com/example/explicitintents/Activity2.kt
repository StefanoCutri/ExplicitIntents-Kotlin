package com.example.explicitintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        //Declare views
        val edt : TextView = findViewById(R.id.txt2)

        //Receive data from activity 2
        val bundle: Bundle? = intent.extras
        val age = bundle?.get("age")

        edt.setText("Your age is: " + age)
    }
}