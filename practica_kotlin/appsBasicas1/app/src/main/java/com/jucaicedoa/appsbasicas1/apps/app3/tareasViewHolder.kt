package com.jucaicedoa.appsbasicas1.apps.app3

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jucaicedoa.appsbasicas1.R

class tareasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvTarea: TextView = view.findViewById(R.id.tvTarea)
    private val cbTarea: CheckBox = view.findViewById(R.id.cbTarea)
    fun render(tarea: tarea) {

        if (tarea.estaSeleccionado) {
            tvTarea.paintFlags = tvTarea.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            tvTarea.paintFlags = tvTarea.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        tvTarea.text = tarea.name
        cbTarea.isChecked = tarea.estaSeleccionado

        val color = when (tarea.categoria) {
            taskCategory.negocios -> R.color.teal_200
            taskCategory.otros -> R.color.teal_700
            taskCategory.personal -> R.color.purple_200
        }

        cbTarea.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTarea.context, color)
        )


    }
}
