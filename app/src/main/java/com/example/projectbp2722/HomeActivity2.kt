package com.example.projectbp2722

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btnBookKidActivity:Button = findViewById(R.id.buttonMenu1)


            val rvBuku:RecyclerView=findViewById(R.id.recycleViewBuku)
            //set layout manager recylerview
            rvBuku.layoutManager=LinearLayoutManager(this)
            //list data buku
            val data = ArrayList<BukuModel>()
            data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem ipsum Dolor Sit Amet Lorem ipsum Dolor Sit Amet"))

        btnBookKidActivity.setOnClickListener{
            val intentBookid=Intent(this,BookKidActivity::class.java)
            startActivity(intentBookid)
        }

    }
}