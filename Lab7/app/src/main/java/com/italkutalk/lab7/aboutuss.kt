package com.italkutalk.lab7

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class aboutuss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutuss)

        val exit123 = findViewById<Button>(R.id.button8)
        val insta = findViewById<View>(R.id.imageButton) as ImageButton
        insta.setOnClickListener {
            val url = Uri.parse("\"https://instagram.com/htfs111\"")
            val instagram = Intent(Intent.ACTION_VIEW,url)
            instagram.setPackage("com.instagram.android")
            try {
                startActivity(instagram)
            }catch (e:ActivityNotFoundException){
                startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("https://instagram.com/htfs111")))
            }



            }
        exit123.setOnClickListener {
            //建立 AlertDialog 物件

            startActivity(Intent(this, MainActivity::class.java))
            showToast("返回首頁")
        }
    }
    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}