package com.igorsantos.carouselwithviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.igorsantos.carouselwithviewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val carouselItems: ArrayList<CarouselItems> = ArrayList()
        carouselItems.add(CarouselItems(R.drawable.image1))
        carouselItems.add(CarouselItems(R.drawable.image2))
        carouselItems.add(CarouselItems(R.drawable.image3))
        carouselItems.add(CarouselItems(R.drawable.image4))

        binding.viewPager.adapter = CarouselAdapter(carouselItems)
    }
}