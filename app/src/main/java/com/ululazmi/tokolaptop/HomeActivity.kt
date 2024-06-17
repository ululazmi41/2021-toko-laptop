package com.ululazmi.tokolaptop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
//    var PACKAGE_NAME: String? = null

    private lateinit var rvLaptop: RecyclerView
    private var list: ArrayList<Laptop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLaptop = findViewById(R.id.rv_heroes)
        rvLaptop.setHasFixedSize(true)

        list.addAll(LaptopData.listData)

        showRecyclerList()
    }


    private fun showRecyclerList() {
        rvLaptop.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListLaptopAdapter(list)
        rvLaptop.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListLaptopAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Laptop) {
                showSelectedLaptop(data)
            }
        })
    }

    private fun showSelectedLaptop(laptop: Laptop) {
        val moveIntent = Intent(this, LaptopActivity::class.java)

        moveIntent.putExtra(LaptopActivity.EXTRA_PHOTO, laptop.photoName)
        moveIntent.putExtra(LaptopActivity.EXTRA_NAME, laptop.name)
        moveIntent.putExtra(LaptopActivity.EXTRA_PRICE, laptop.price)
        moveIntent.putExtra(LaptopActivity.EXTRA_DETAIL, laptop.detail)

        startActivity(moveIntent)
    }

    // Menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_laptop -> {
                val moveIntent = Intent(this, HomeActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.action_about -> {
                val moveIntent = Intent(this, AboutActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }
}