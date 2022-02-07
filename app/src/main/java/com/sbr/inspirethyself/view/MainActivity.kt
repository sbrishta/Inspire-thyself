package com.sbr.inspirethyself.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.sbr.inspirethyself.R
import com.sbr.inspirethyself.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataset = DataSource().getAllData()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ItemAdapter(this,dataset)
        recyclerView.setHasFixedSize(true)
    }
}