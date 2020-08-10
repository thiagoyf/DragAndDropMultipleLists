package com.example.draganddropmultiplelists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListItemAdapter(private val listData: List<ListItemModel>) : RecyclerView.Adapter<ListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_list_item, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(listData[position])
    }

}