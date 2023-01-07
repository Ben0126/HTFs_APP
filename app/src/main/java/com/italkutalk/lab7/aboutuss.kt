package com.italkutalk.lab7

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class aboutuss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutuss)
        val insta = findViewById<View>(R.id.insta) as Button
        insta.setOnClickListener {
            val url = Uri.parse("\"https://instagram.com/htfs1117\"")
            val instagram = Intent(Intent.ACTION_VIEW,url)
            instagram.setPackage("com.instagram.android")
            try {
                startActivity(instagram)
            }catch (e:ActivityNotFoundException){
                startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("https://instagram.com/htfs1117")))
            }

        }
    }
}