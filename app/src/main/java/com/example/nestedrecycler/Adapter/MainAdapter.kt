package com.example.nestedrecycler.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.nestedrecycler.Model.AllCategory
import com.example.nestedrecycler.Model.Category
import com.example.nestedrecycler.R

class MainAdapter(private val context: Context, private val allCategory : List<AllCategory>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(itemView : View) :  RecyclerView.ViewHolder(itemView){

        var itemRecycler : RecyclerView
        var categoryTitle : TextView

        init {
            categoryTitle = itemView.findViewById(R.id.catTitle)
            itemRecycler = itemView.findViewById(R.id.cat_item_recycler)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.main_recycler_row, parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.categoryTitle.text = allCategory[position].CategoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategory[position].categoryItem)
    }

    override fun getItemCount(): Int {
        return allCategory.size
    }

    private fun setCatItemRecycler(recyclerView: RecyclerView, category: List<Category>){

        val itemRecyclerAdapter = CategoryAdapter(context, category)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }
}