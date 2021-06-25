package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    private var duris = 0
    private var qate = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        duris = intent.getIntExtra("duris",0)
        qate = intent.getIntExtra("qate",0)
        durisView.text = "Duris: ${duris.toString()}"
        qateView.text = "Qate: ${qate.toString()}"
        result = 0
        res = 0


        start.setOnClickListener {
            var birinshiActivityAshil = Intent(this,MainActivity::class.java)
            startActivity(birinshiActivityAshil)
            finishAffinity()
        }

        reyting.setOnClickListener {

        }

    }



}