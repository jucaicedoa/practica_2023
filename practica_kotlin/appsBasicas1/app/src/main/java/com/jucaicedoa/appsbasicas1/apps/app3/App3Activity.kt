package com.jucaicedoa.appsbasicas1.apps.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jucaicedoa.appsbasicas1.R
import com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.*

class App3Activity : AppCompatActivity() {
    //esta lista es la que muestra
    private val categorias = listOf(
        negocios,
        personal,
        otros
    )
    private val tareas = mutableListOf(
        tarea("PruebaNegocios", negocios),
        tarea("PruebaPersonal", personal),
        tarea("PruebaOtros", otros)
    )
    private lateinit var rvCategoria: RecyclerView
    private lateinit var adaptadorCategoriaz: adaptadorCategoriaz
    private lateinit var rvTareas: RecyclerView
    private lateinit var adaptadorTareas: adaptadorTareas
    private lateinit var fabTarea: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app3)
        iniciarComponentes()
        iniciarUI()
        iniciarListeners()
    }

    //iniciar componentes
    private fun iniciarComponentes() {
        rvCategoria = findViewById(R.id.rvCategoria)
        rvTareas = findViewById(R.id.rvTareas)
        fabTarea = findViewById(R.id.fabTarea)
    }

    //Iniciar UI
    private fun iniciarUI() {
        adaptadorCategoriaz = adaptadorCategoriaz(categorias)
        rvCategoria.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategoria.adapter = adaptadorCategoriaz

        adaptadorTareas = adaptadorTareas(tareas)
        rvTareas.layoutManager = LinearLayoutManager(this)
        rvTareas.adapter = adaptadorTareas
    }

    //Iniciar listeners
    private fun iniciarListeners() {
        fabTarea.setOnClickListener { mostrarDialogo() }
    }

    //Mostrar diálogo
    private fun mostrarDialogo() {

    }

}
