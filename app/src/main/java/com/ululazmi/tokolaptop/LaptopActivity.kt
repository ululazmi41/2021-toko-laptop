package com.ululazmi.tokolaptop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LaptopActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laptop)

        val ivPhoto : ImageView = findViewById(R.id.iv_photo)
        val tvName : TextView = findViewById(R.id.tv_item_name)
        val tvPrice : TextView = findViewById(R.id.tv_item_price)
        val tvDetail : TextView = findViewById(R.id.tv_item_detail)

        val photo = getIntent().getStringExtra(EXTRA_PHOTO)
        val price = getIntent().getStringExtra(EXTRA_PRICE)
        val name = getIntent().getStringExtra(EXTRA_NAME)
        val detail = getIntent().getStringExtra(EXTRA_DETAIL)

        val drawableId : Int = getResources().getIdentifier(photo, "drawable", BuildConfig.APPLICATION_ID)
        ivPhoto.setImageResource(drawableId);

        tvPrice.text = "Harga: " + price
        tvName.setText(name)
        tvDetail.text = detail

        // Back
        var actionBar = getSupportActionBar()
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        val btn_share : Button = findViewById(R.id.btn_share)

        btn_share.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_share -> {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.setType("text/plain")
                val text =  "Beli " + intent.getStringExtra(EXTRA_NAME) +
                        " di #TokoLaptop\nhttps://www.toko-laptop.co.id"
                shareIntent.putExtra(Intent.EXTRA_TEXT, text)
                startActivity(Intent.createChooser(shareIntent, "Share ke"))
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            android.R.id.home -> {
                val moveIntent = Intent(this, HomeActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}