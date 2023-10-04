package com.example.projectbp2722

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword : EditText = findViewById(R.id.editTextPassword)
        val LogModel = LoginModel()

        //event btn login diklik
        btnLogin.setOnClickListener {
            //input
            LogModel.username = txtUsername.text.toString()
            LogModel.password = txtPassword.text.toString()

            //validasi LOGIN
            if(LogModel.loginCek() == true){
                //cALL HOME ACTIVITY
                val intenhome = Intent(this, HomeActivity2::class.java)
                startActivity(intenhome)
            }else{
                Toast.makeText(this,"Username/Password salah",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }

}