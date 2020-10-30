package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info(message = "On Create")



        andVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        andVersionRecyclerView.adapter = AndVersionAdapter(seedItems(4))
        andVersionRecyclerView.setHasFixedSize(true)
    }

    private fun seedItems(size : Int): List<AndVersion> {

        val items = ArrayList<AndVersion>()

        val nameArray = resources.getStringArray(R.array.andVersionName)
        val imgArray = intArrayOf(R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.pizza)
        for (i in 0 until size)
            items += AndVersion(nameArray[i], imgArray[i])
        return  items
    }
}