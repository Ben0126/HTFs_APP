package com.italkutalk.lab7

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class partimejoblist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //將變數與 XML 元件綁定

        val back = findViewById<Button>(R.id.button4)
        val continuee = findViewById<Button>(R.id.button5)
        continuee.text="選擇住宿"
        val listView = findViewById<ListView>(R.id.listView)
        val count = ArrayList<String>() //儲存購買數量資訊
        val item = ArrayList<Item>() //儲存水果資訊

        val array =
            resources.obtainTypedArray(R.array.image_listt) //從 R 類別讀取圖檔

        val word = listOf("132", "456", "465", "465", "468")


        for (i in 0 until array.length()) {
            val photo = array.getResourceId(i, 0) //水果圖片 Id
            val name = word[i].toString()
//            val name = "打工${i + 1}" //水果名稱

            item.add(Item(photo, name)) //新增水果資訊
        }
        array.recycle() //釋放圖檔資源
        //建立 ArrayAdapter 物件，並傳入字串與 simple_list_item_1.xml

        //建立 MyAdapter 物件，並傳入 adapter_horizontal 作為畫面
        listView.adapter = MyAdapterpartime(
            this, item,
            R.layout.adapter_horizontal
        )



        continuee.setOnClickListener {
            startActivity(Intent(this, mainplease::class.java))
        }

        back.setOnClickListener {
            //建立 AlertDialog 物件
            AlertDialog.Builder(this)
                .setTitle("取消選取")
                .setMessage("確定要取消嗎？")

                .setNegativeButton("確定") { dialog, which ->
                    startActivity(Intent(this, MainActivity::class.java))
                    showToast("返回首頁")
                }
                .setPositiveButton("取消") { dialog, which ->
                    showToast("取消")
                }.show()
        }

    }
    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}


//設計新的類別定義水果的資料結構
data class Item2(
    val photo: Int, //圖片
    val name: String //名稱

)