package com.example.nestedrecycler.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycler.Model.Category
import com.example.nestedrecycler.R

class CategoryAdapter(private val context: Context, private val categoryItem : List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var itemImage : ImageView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row, parent, false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.itemImage.setImageResource(categoryItem[position].imagerUrl)
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }

}