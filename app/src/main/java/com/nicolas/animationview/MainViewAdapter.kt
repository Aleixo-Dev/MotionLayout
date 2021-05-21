package com.nicolas.animationview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nicolas.animationview.databinding.ItemsFoodRecyclerViewBinding

data class Food(
    val img: Int,
    val name: String,
    val description: String
)

class MainViewAdapter(private val listFood: List<Food>) :
    RecyclerView.Adapter<MainViewAdapter.FoodViewHolder>() {

    class FoodViewHolder(private var binding: ItemsFoodRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var tvFood: ImageView = binding.ivFood
        var tvTitle: TextView = binding.tvTitle
        var tvDescription: TextView = binding.tvDescription

        fun bind(food: Food) {
            tvFood.setImageResource(food.img)
            tvTitle.text = food.name
            tvDescription.text = food.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val layout =
            ItemsFoodRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(layout)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(listFood[position])
    }

    override fun getItemCount() = listFood.size
}