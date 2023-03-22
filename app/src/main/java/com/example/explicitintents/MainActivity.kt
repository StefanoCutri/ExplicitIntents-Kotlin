package com.example.explicitintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare views
        val btn :Button = findViewById(R.id.button)
        val txt :EditText = findViewById(R.id.edt)

        btn.setOnClickListener(){

            //Go to second activity if input is not empty
            if (txt.text.isNotEmpty()){

                //Explicit Intents
                var i = Intent(this, Activity2::class.java)

                //Pass data to second activity
                i.putExtra("age", txt.text)

                startActivity(i)


            }
        }

    }
}