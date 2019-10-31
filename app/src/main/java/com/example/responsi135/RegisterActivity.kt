package com.example.responsi135

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_selesai.setOnClickListener {
            intent = Intent (this,AccountActivity::class.java)
            intent.putExtra("nama", nam.text)
            intent.putExtra("pass", pass2.text)
            intent.putExtra("nim", nim.text)
            intent.putExtra("kelas", kls.text)
            startActivity(intent)
    }
}}
