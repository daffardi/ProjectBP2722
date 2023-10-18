package com.example.projectbp2722

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)
        val call:TextView = findViewById(R.id.textView8)
        call.setOnClickListener{
            val callIntent: Intent = Uri.parse("tel :(0274) 884201").let {
                number->Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }
    }
}