package com.example.myapplication

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_and_version.*
import kotlinx.android.synthetic.main.item_and_version.view.*
import org.jetbrains.anko.toast

class AndVersionAdapter(private val items: List<AndVersion>) : RecyclerView.Adapter<AndVersionAdapter.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndVersionAdapter.ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_and_version))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]

        holder.imageView.setImageResource(currentItem.img)
        holder.textView.text = currentItem.name
        holder.imageView.setOnClickListener { holder.imageView.context.toast(currentItem.name)}
    }

    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view)  {

        val imageView: ImageView = view.andVersionImg
        val textView: TextView = view.andVersionTxt



    }

}

