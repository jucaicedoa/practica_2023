package com.jucaicedoa.appsbasicas1.apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jucaicedoa.appsbasicas1.R
import com.jucaicedoa.appsbasicas1.apps.app1.App1Activity

class PantallaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicial)
        //Botón y evento  app1
        val BtnApp1 = findViewById<Button>(R.id.BtnApp1)
        BtnApp1.setOnClickListener { funcionaBoton1() }
    }

    private fun funcionaBoton1(){
        val intent = Intent(this, App1Activity::class.java)
        startActivity(intent)
    }


}