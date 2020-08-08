package com.example.draganddropmultiplelists

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomPagerAdapter(activity: AppCompatActivity, val itemsCount: Int) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }

}