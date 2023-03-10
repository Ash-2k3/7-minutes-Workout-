package com.example.a7minsworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minsworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  var binding : ActivityMainBinding?  = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStartBtn!!.setOnClickListener {
               Toast.makeText(this,"Starting the exercise" , Toast.LENGTH_SHORT).show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}