package com.example.draganddropmultiplelists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customPagerAdapter = CustomPagerAdapter(this, 10)
        viewPage2.adapter = customPagerAdapter
        viewPage2.offscreenPageLimit = 3
    }
}