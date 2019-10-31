package com.example.responsi135

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener(){
            val username = user.text.toString()
            val password = pass.text.toString()
            if(username == "wawan" && password == "123"){
                intent = Intent (this,HomeActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@LoginActivity, "username pasword salah",   Toast.LENGTH_LONG).show()
            }}
        btn_regis.setOnClickListener(){
            intent = Intent (this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
