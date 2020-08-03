package com.example.recyclerview_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleItemList = generateList(100)

        recyclerview = findViewById(R.id.recyclerview)

        recyclerview.adapter = ExampleAdapter(exampleItemList)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)


    }

    private fun generateList(size: Int): ArrayList<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size){
            val item = ExampleItem("text1 $i" ,"Line 2" )
            list += item
        }
        return list
    }
}