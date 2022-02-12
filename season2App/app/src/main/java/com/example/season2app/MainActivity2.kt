package com.example.season2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.season2app.databinding.ActivityMain2Binding
import com.example.season2app.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding =  ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun fooo(){
        binding.textView2
    }
}