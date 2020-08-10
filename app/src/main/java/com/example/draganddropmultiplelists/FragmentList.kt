package com.example.draganddropmultiplelists

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentList : Fragment() {

    private val pageTitle by lazy { arguments?.getString("title") ?: "" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_list, container, false)

        val title = rootView.findViewById<AppCompatTextView>(R.id.title)
        val recyclerViewList = rootView.findViewById<RecyclerView>(R.id.recyclerViewList)
        title.text = pageTitle

        val listData = mutableListOf<ListItemModel>()
        for (i in 0..99) {
            listData.add(
                ListItemModel("$pageTitle - ${i + 1}", "subtitle - ${i + 1}")
            )
        }

        recyclerViewList.layoutManager = LinearLayoutManager(activity)
        recyclerViewList.adapter = ListItemAdapter(listData)

        return rootView
    }

}