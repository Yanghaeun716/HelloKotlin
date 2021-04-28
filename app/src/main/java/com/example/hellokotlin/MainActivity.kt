package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJAVA = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)

        btnJAVA.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }
        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
    }
}