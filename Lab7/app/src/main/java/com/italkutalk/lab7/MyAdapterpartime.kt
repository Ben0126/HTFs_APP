package com.italkutalk.lab7

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.RadioButton

class MyAdapterpartime(context: Context, data: ArrayList<Item>, private val layout: Int) : ArrayAdapter<Item>(context, layout, data) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //依據傳入的 Layout 建立畫面
        val view2 = View.inflate(parent.context, layout, null)
        //依據 position 取得對應的資料內容
        val item2 = getItem(position) ?: return view2
        //將圖片指派給 ImageView 呈現
        val img_photo2 = view2.findViewById<ImageView>(R.id.img_photo)
        img_photo2.setImageResource(item2.photo)
        //將訊息指派給 TextView 呈現，若是垂直排列則為名稱，否則為名稱及價格

        val choose2 = view2.findViewById<RadioButton>(R.id.radioButton)
        choose2.text =  item2.name
        //回傳此項目的畫面
        return view2
    }
}