package com.example.homework10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.homework10.data.DataSource
import com.example.homework10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = ViewSlidePagerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.listItemsSizeNumberTxtView.text = adapter.listPhoto.size.toString()
        binding.itemPositionNumberTxtView.text = "0"
        adapter.listPhoto = DataSource.photos
        binding.viewPager.adapter = adapter
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.listItemsSizeNumberTxtView.text = adapter.listPhoto.size.toString()
                binding.itemPositionNumberTxtView.text = position.toString()
            }
        })
    }
}