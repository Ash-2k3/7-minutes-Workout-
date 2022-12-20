package com.example.a7minsworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flStartButton : FrameLayout = findViewById(R.id.fl_start_btn)
        flStartButton.setOnClickListener {
               Toast.makeText(this,"Starting the exercise" , Toast.LENGTH_SHORT).show()
        }

    }


}