package com.example.day18viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.day18viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if(binding.checkbox.isChecked){
                // open a new Screen
                Toast.makeText(this,"This app is still under development.",Toast.LENGTH_SHORT).show()
            }else{
                binding.checkbox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"Please accept the T&C.",Toast.LENGTH_SHORT).show()
            }
        }
    }
}