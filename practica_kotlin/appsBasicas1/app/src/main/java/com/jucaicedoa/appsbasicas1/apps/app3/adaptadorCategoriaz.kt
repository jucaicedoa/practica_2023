package com.jucaicedoa.appsbasicas1.apps.app3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jucaicedoa.appsbasicas1.R

class adaptadorCategoriaz(
    private val categorias: List<taskCategory>,
    private val estaSeleccionada: (Int) -> Unit
) :
    RecyclerView.Adapter<categoriasViewHolder>() {
    //Crea una lista para
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): categoriasViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_task_categoria, parent, false)
        return categoriasViewHolder(view)
    }

    //Cantidad que va a mostrar
    override fun getItemCount() = categorias.size

    //Acceder a valores
    override fun onBindViewHolder(holder: categoriasViewHolder, position: Int) {
        holder.render(categorias[position], estaSeleccionada)
    }

}
