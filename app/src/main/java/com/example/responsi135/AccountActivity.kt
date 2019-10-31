package com.example.responsi135

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_home.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val enama = bundle?.get("nama")
        val epass2 = bundle?.get("pass")
        val enim = bundle?.get("nim")
        val ekelas = bundle?.get("kelas")
        namaa.text=enama.toString()
        passe.text=epass2.toString()
        nime.text=enim.toString()
        kelase.text=ekelas.toString()

        btn_home.setOnClickListener(){
            intent = Intent (this,LoginActivity::class.java)
            startActivity(intent)}
    }
}
