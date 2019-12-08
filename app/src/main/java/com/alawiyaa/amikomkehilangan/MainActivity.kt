package com.alawiyaa.amikomkehilangan

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

            if (user == "admin" && pass=="admin"){
               Toast.makeText(this,"Login Sukses",Toast.LENGTH_SHORT).show()

            }else  {
              Toast.makeText(this,"Login Gagal",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
