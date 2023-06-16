package com.jucaicedoa.appsbasicas1.apps.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.jucaicedoa.appsbasicas1.R

class App1Activity : AppCompatActivity() {
    //Arranque pantalla
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app1)
        val btnInicio = findViewById<AppCompatButton>(R.id.btnInicio)
        val espacioNombre = findViewById<AppCompatEditText>(R.id.espacioNombre)
        //Evento para botón inicio
        btnInicio.setOnClickListener {
            val name = espacioNombre.text.toString()
            //Acciones si no está vacía el espacioNombre
            if (name.isNotEmpty()) {
                val intent = Intent(this, Resultado1Activity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}