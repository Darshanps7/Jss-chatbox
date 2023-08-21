package com.example.sekobanashi.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sekobanashi.R
import kotlinx.android.synthetic.main.activity_firstpage.*

class firstpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)
        nxt.setOnClickListener{
            startActivity(Intent(this@firstpage,LogReg::class.java))
        }
    }
}