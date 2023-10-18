package com.example.projectbp2722

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterResponsi (private val listPerpus :List<PerpusModel>):
    RecyclerView.Adapter<AdapterResponsi.ViewHolder>() {

    class ViewHolder (ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val image: ImageView = itemView.findViewById(R.id.imagePerpus1)
        val title: TextView = itemView.findViewById(R.id.textView2)
        val desc : TextView = itemView.findViewById(R.id.textView10)

        verride fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResponsi.ViewHolder {
            val view = LayoutInflater. from(parent.context).inflate(
                R.layout.card_layout_responsi,parent,false)
            return AdapterResponsi.ViewHolder(view)}

        override fun onBindViewHolder(holder: AdapterHome.ViewHolder, position: Int) {
            val modelperpus = listperpus [position]
            holder.image.setImageResource(modelperpus.image)
            holder.title.text = modelperpus.title
            holder.desc.text = modelperpus.desc
            TODO("Not yet implemented")}

            override fun getItemCount(): Int {
                return listperpus.size
                TODO("Not yet implemented")
            }
        }

