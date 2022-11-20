package com.example.nestedrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycler.Adapter.MainAdapter
import com.example.nestedrecycler.Model.AllCategory
import com.example.nestedrecycler.Model.Category

class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler : RecyclerView? = null
    private var mainRecyclerAdapter : MainAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Tunggu Sebentar",Toast.LENGTH_SHORT).show()

        //data gambar
        val categoryItemList : MutableList<Category> = ArrayList()
        categoryItemList.add(Category(1,R.drawable.running))
        categoryItemList.add(Category(1,R.drawable.running))
        categoryItemList.add(Category(1,R.drawable.running))
        categoryItemList.add(Category(1,R.drawable.running))
        categoryItemList.add(Category(1,R.drawable.running))
        categoryItemList.add(Category(1,R.drawable.running))

        //gambar 2
        val categoryItemList2 : MutableList<Category> = ArrayList()
        categoryItemList2.add(Category(1,R.drawable.footbal))
        categoryItemList2.add(Category(1,R.drawable.footbal))
        categoryItemList2.add(Category(1,R.drawable.footbal))
        categoryItemList2.add(Category(1,R.drawable.footbal))
        categoryItemList2.add(Category(1,R.drawable.footbal))
        categoryItemList2.add(Category(1,R.drawable.footbal))

        //gambar 3
        val categoryItemList3 : MutableList<Category> = ArrayList()
        categoryItemList3.add(Category(1,R.drawable.basketball))
        categoryItemList3.add(Category(1,R.drawable.basketball))
        categoryItemList3.add(Category(1,R.drawable.basketball))
        categoryItemList3.add(Category(1,R.drawable.basketball))
        categoryItemList3.add(Category(1,R.drawable.basketball))
        categoryItemList3.add(Category(1,R.drawable.basketball))

        val categoryItemList4 : MutableList<Category> = ArrayList()
        categoryItemList4.add(Category(1,R.drawable.footbal))
        categoryItemList4.add(Category(1,R.drawable.splash))
        categoryItemList4.add(Category(1,R.drawable.basketball))
        categoryItemList4.add(Category(1,R.drawable.running))
        categoryItemList4.add(Category(1,R.drawable.basketball))
        categoryItemList4.add(Category(1,R.drawable.sneakers))

        val categoryItemList5 : MutableList<Category> = ArrayList()
        categoryItemList5.add(Category(1,R.drawable.bag))
        categoryItemList5.add(Category(1,R.drawable.basketball))
        categoryItemList5.add(Category(1,R.drawable.sneakers))
        categoryItemList5.add(Category(1,R.drawable.running))
        categoryItemList5.add(Category(1,R.drawable.footbal))
        categoryItemList5.add(Category(1,R.drawable.basketball))

        //data judul
        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Indomie", categoryItemList))
        allCategory.add(AllCategory("Sambel", categoryItemList2))
        allCategory.add(AllCategory("Coklat", categoryItemList3))
        allCategory.add(AllCategory("Rokok", categoryItemList4))
        allCategory.add(AllCategory("Es Krim", categoryItemList5))

        setMainCategoryRecycler(allCategory)
    }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>){

        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this, )
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainAdapter(this, allCategory)
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter
    }
}