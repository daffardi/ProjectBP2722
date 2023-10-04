package com.example.projectbp2722

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2722.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding:ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonFairy.setOnClickListener{

        }
        binding.buttonFable.setOnClickListener{

        }
        binding.buttonScience.setOnClickListener{
        }

        fun replaceFragment (frg:Fragment) {
            val fragmentManager = supportFragmentManager
            val fragmentTrx = fragmentManager.beginTransaction()
            fragmentTrx.replace(R.id.fragmentKidBook,frg)
            fragmentTrx.commit()

        }
    }
}