package com.igorsantos.carouselwithviewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.igorsantos.carouselwithviewpager2.databinding.CarouselItemContainerBinding

class CarouselAdapter(
    private val carouselItems: ArrayList<CarouselItems>
) : RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    class CarouselViewHolder(
        private val binding: CarouselItemContainerBinding
    ) : RecyclerView.ViewHolder (binding.root){
        fun setImages(carouselItems: CarouselItems) {
            binding.imageSlide.setImageResource(carouselItems.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(
            CarouselItemContainerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false)
        )
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.setImages(carouselItems = carouselItems[position])
    }

    override fun getItemCount(): Int = carouselItems.size
}