package com.jucaicedoa.appsbasicas1.apps.app3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jucaicedoa.appsbasicas1.R

class adaptadorTareas(private val tarea: List<tarea>) : RecyclerView.Adapter<tareasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tareasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return tareasViewHolder(view)
    }

    override fun getItemCount() = tarea.size

    override fun onBindViewHolder(holder: tareasViewHolder, position: Int) {
        holder.render(tarea[position])
    }

}
