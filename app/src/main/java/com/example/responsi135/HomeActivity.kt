package com.example.responsi135

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        listView = findViewById(R.id.listView)
        var list = mutableListOf<model>()

        list.add(model("mose",   "ini mose",   R.drawable.mose  ))
        list.add(model("keyboard",   "ini keyboard",   R.drawable.keyboard  ))
        list.add(model("cpu", "cpu", R.drawable.cpu  ))
        list.add(model("monitor",  "monitor",  R.drawable.monitor    ))
        list.add(model("ram",  "ram",  R.drawable.ram  ))
        list.add(model("ssd",  "ssd",  R.drawable.ssd ))
        list.add(model("cd",  "cd",  R.drawable.cd  ))
        list.add(model("spiker",  "spiker",  R.drawable.spiker  ))
        list.add(model("motherboard",  "motherboard",  R.drawable.mb  ))
        list.add(model("monitor",  "monitor",  R.drawable.monitor  ))


        listView.adapter = adapter(this,R.layout.item,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                intent = Intent (this,DetailActivity::class.java)
                startActivity(intent) }
            if (position==1){
                intent = Intent (this,keyboard2::class.java)
                startActivity(intent) }
            if (position==2){
                intent = Intent (this,cpu2::class.java)
                startActivity(intent) }
            if (position==3){
                intent = Intent (this,monitor2::class.java)
                startActivity(intent) }
            if (position==4){
                intent = Intent (this,ram2::class.java)
                startActivity(intent) }
            if (position==5){
                intent = Intent (this,ssd2::class.java)
                startActivity(intent) }
            if (position==6){
                intent = Intent (this,cd2::class.java)
                startActivity(intent) }
            if (position==7){
                intent = Intent (this,spiker2::class.java)
                startActivity(intent) }
            if (position==8){
                intent = Intent (this,mb2::class.java)
                startActivity(intent) }
            if (position==9){
                intent = Intent (this,monitor2::class.java)
                startActivity(intent) }

        }

        btn_acon.setOnClickListener(){
        intent = Intent (this,AccountActivity::class.java)
        startActivity(intent)}

    }
}
