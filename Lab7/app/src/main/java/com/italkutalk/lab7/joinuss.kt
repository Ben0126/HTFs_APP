package com.italkutalk.lab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class joinuss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joinuss)

        val namee = findViewById<EditText>(R.id.editTextTextPersonName)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)


        val name = findViewById<TextView>(R.id.textView4)
        val emaill = findViewById<TextView>(R.id.textView5)

        val exit = findViewById<Button>(R.id.button6)
        val correct = findViewById<Button>(R.id.button7)

        exit.setOnClickListener {
            //建立 AlertDialog 物件

                    startActivity(Intent(this, MainActivity::class.java))
                    showToast("返回首頁")

        }

        correct.setOnClickListener {

            if (namee.length() < 1) {
                name.text = "請輸入店家名稱！"
                showToast("店家名稱尚未輸入")//執行showToast方法
                return@setOnClickListener
            }

           if (email.length() < 1) {
                emaill.text = "請輸入電子郵件！"
               showToast("電子郵件尚未輸入")//執行showToast方法
                return@setOnClickListener
            }
            //建立 AlertDialog 物件
            AlertDialog.Builder(this)
                .setTitle("送出表單")
                .setMessage("確定資料都正確嗎？")

                .setNegativeButton("確定") { dialog, which ->
                    startActivity(Intent(this, MainActivity::class.java))
                    showToast("感謝您的填寫")
                }
                .setPositiveButton("取消") { dialog, which ->
                    showToast("請輸入資料")
                }.show()
        }


    }
    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}