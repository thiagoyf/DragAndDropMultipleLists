package com.example.draganddropmultiplelists

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class ListItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data: ListItemModel) {
        val title = itemView.findViewById<AppCompatTextView>(R.id.list_item_title)
        val subtitle = itemView.findViewById<AppCompatTextView>(R.id.list_item_subtitle)

        title.text = data.title
        subtitle.text = data.subtitle
    }

}