package com.ululazmi.tokolaptop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Back
        var actionBar = getSupportActionBar()


        if (actionBar != null) {

            // showing the back button in action bar
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
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
            android.R.id.home -> {
                val moveIntent = Intent(this, HomeActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}