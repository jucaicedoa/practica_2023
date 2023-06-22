package com.jucaicedoa.appsbasicas1.apps.app3

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jucaicedoa.appsbasicas1.R

class tareasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvTarea: TextView = view.findViewById(R.id.tvTarea)
    private val cbTarea: CheckBox = view.findViewById(R.id.cbTarea)
    fun render(tarea: tarea) {
        tvTarea.text = tarea.name
    }
}
