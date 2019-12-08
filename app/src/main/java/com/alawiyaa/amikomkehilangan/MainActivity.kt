package com.alawiyaa.amikomkehilangan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
           val user = editUser.text.toString()
           val pass = editPass.text.toString()

            if (user == "user" && pass=="admin"){
              startActivity(Intent(this,Main2Activity::class.java))
            }else  {
              Toast.makeText(this,"Login Gagal",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
