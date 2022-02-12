package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var userName:EditText
    lateinit var helloBox:TextView
    var name="ناشناس"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button_Enter)
        userName=findViewById(R.id.editTextPersonName)
        helloBox=findViewById(R.id.textView2)
        button.setOnClickListener {
            name=userName.text.toString()
            helloBox.setText("سلام ${userName.text}")
        }
    }
}