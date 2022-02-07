package com.sbr.inspirethyself.view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.sbr.inspirethyself.R
import com.sbr.inspirethyself.model.Inspiration

class ItemAdapter(val context: Context, val dataset: List<Inspiration>): Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.tv_item)
        val imageView = itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        Log.d("Adapter","onCreateViewHolder")

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val modelItem = dataset[position]
        holder.textView.text = context.resources.getString(modelItem.stringResourceId)
        holder.imageView.setImageResource(modelItem.drawableResourceId)
        Log.d("Adapter","onBindViewHolder data: ${modelItem.stringResourceId}")

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}