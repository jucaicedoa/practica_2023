package com.jucaicedoa.appsbasicas1.apps.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jucaicedoa.appsbasicas1.R

class Resultado1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado1)
        val vistaResult = findViewById<TextView>(R.id.vistaResult)
        val nombre: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        vistaResult.text = "Hola $nombre"
    }
}