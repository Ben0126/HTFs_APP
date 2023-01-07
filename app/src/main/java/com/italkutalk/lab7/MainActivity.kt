package com.italkutalk.lab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainplease)

        val aboutus = findViewById<Button>(R.id.button)
        val partimejob = findViewById<Button>(R.id.button3)
        val wannajoin = findViewById<Button>(R.id.button2)

        showToast("歡迎來到快樂宿朋友")

        aboutus.setOnClickListener{
            showToast("關於我們")
            startActivity(Intent(this, aboutuss::class.java))
        }

        partimejob.setOnClickListener{
            showToast("請選擇你喜歡的打工")
            startActivity(Intent(this, partimejoblist::class.java))
        }

        wannajoin.setOnClickListener{
            showToast("返回首頁")
            startActivity(Intent(this, joinuss::class.java))
        }

    }
    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

