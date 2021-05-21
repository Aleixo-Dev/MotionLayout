package com.nicolas.animationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nicolas.animationview.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = MainViewAdapter(foodListData())
        }
    }

    private fun foodListData(): ArrayList<Food> = arrayListOf(
        Food(
            R.drawable.beef,
            "Beef",
            "BBeef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times."

        ),
        Food(
            R.drawable.chicken,
            "Chicken",
            "hicken is a type of domesticated fowl, a subspecies of the red junglefowl. It is one of the most common and widespread domestic animals, with a total population of more than 19 billion as of 2011."
        ),
        Food(
            R.drawable.dessert,
            "Dessert",
            "Dessert is a course that concludes a meal. The course usually consists of sweet foods, such as confections dishes or fruit, and possibly a beverage such as dessert wine or liqueur, however in the United States it may include."
        ),
    )
}