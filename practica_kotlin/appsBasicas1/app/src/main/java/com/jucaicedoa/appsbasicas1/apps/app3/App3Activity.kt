package com.jucaicedoa.appsbasicas1.apps.app3

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
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
        adaptadorCategoriaz = adaptadorCategoriaz(categorias) { actualizarCategorias(it) }
        rvCategoria.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategoria.adapter = adaptadorCategoriaz

        adaptadorTareas = adaptadorTareas(tareas) { tareaSeleccionada(it) }

        rvTareas.layoutManager = LinearLayoutManager(this)
        rvTareas.adapter = adaptadorTareas
    }

    private fun actualizarCategorias(position: Int) {
        categorias[position].estaSeleccionada = !categorias[position].estaSeleccionada
        adaptadorCategoriaz.notifyItemChanged(position)
        actualizarTareas()
    }

    //Iniciar listeners
    private fun iniciarListeners() {
        fabTarea.setOnClickListener { mostrarDialogo() }
    }

    //Mostrar diálogo
    private fun mostrarDialogo() {
        val dialogo = Dialog(this)
        dialogo.setContentView(R.layout.dialogo_tareas)
        val btnAgregarTareas: Button = dialogo.findViewById(R.id.btnAgregarTareas)
        val etTarea: EditText = dialogo.findViewById(R.id.etTarea)
        val rgCategorias: RadioGroup = dialogo.findViewById(R.id.rgCategorias)

        btnAgregarTareas.setOnClickListener {
            val texto = etTarea.text.toString()
            if (texto.isNotEmpty()) {
                val seleccionadoId = rgCategorias.checkedRadioButtonId
                val radioButtonSeleccionado: RadioButton =
                    rgCategorias.findViewById(seleccionadoId)
                val currentCategory: taskCategory = when (radioButtonSeleccionado.text) {
                    getString(R.string.negocios) -> negocios
                    "Personal" -> personal
                    else -> otros
                }
                tareas.add(tarea(etTarea.text.toString(), currentCategory))
                actualizarTareas()
                dialogo.hide()
            }
        }

        dialogo.show()
    }

    private fun tareaSeleccionada(position: Int) {
        tareas[position].estaSeleccionado = !tareas[position].estaSeleccionado
        actualizarTareas()
    }

    private fun actualizarTareas() {
        val categoriaSeleccio: List<taskCategory> = categorias.filter { it.estaSeleccionada }
        val nuevasTareas = tareas.filter { categoriaSeleccio.contains(it.categoria) }
        adaptadorTareas.tarea = nuevasTareas
        adaptadorTareas.notifyDataSetChanged()
    }


}
