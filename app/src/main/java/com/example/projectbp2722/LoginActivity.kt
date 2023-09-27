package com.example.projectbp2722

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        //event btn login diklik
        btnLogin.setOnClickListener {
            val intenhome = Intent(this, HomeActivity2::class.java)
            startActivity(intenhome)
        }
    }
}