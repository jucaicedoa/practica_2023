package com.jucaicedoa.appsbasicas1.apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.jucaicedoa.appsbasicas1.R
import com.jucaicedoa.appsbasicas1.apps.app1.App1Activity
import com.jucaicedoa.appsbasicas1.apps.app2.App2Activity
import com.jucaicedoa.appsbasicas1.apps.app3.App3Activity
import com.jucaicedoa.appsbasicas1.apps.app4.App4ListadoActivity

class PantallaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicial)
        //Botón y evento  app1, app2, app3
        val BtnApp1 = findViewById<AppCompatButton>(R.id.BtnApp1)
        val BtnApp2 = findViewById<AppCompatButton>(R.id.BtnApp2)
        val BtnApp3 = findViewById<AppCompatButton>(R.id.BtnApp3)
        val BtnApp4 = findViewById<AppCompatButton>(R.id.BtnApp4)
        BtnApp1.setOnClickListener { funcionaBoton1() }
        BtnApp2.setOnClickListener { funcionaBoton2() }
        BtnApp3.setOnClickListener { funcionaBoton3() }
        BtnApp4.setOnClickListener { funcionaBoton4() }
    }

    private fun funcionaBoton4() {
        val intent = Intent(this,App4ListadoActivity::class.java)
        startActivity(intent)
    }

    private fun funcionaBoton3() {
        val intent = Intent(this, App3Activity::class.java)
        startActivity(intent)
    }

    //Intent hacia Activity App2
    private fun funcionaBoton2() {
        val intent = Intent(this, App2Activity::class.java)
        startActivity(intent)
    }

    //Intent hacia Activity App1
    private fun funcionaBoton1() {
        val intent = Intent(this, App1Activity::class.java)
        startActivity(intent)
    }

}
