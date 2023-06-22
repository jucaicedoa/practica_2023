package com.jucaicedoa.appsbasicas1.apps.app3

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jucaicedoa.appsbasicas1.R

class categoriasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvCategoria:TextView =  view.findViewById(R.id.tvNombreCategoria)
    private val divisor:View = view.findViewById(R.id.divisor)
    fun render(taskCategory: taskCategory){
        when(taskCategory){
            com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.negocios -> {
                tvCategoria.text = "Negocios"
                divisor.setBackgroundColor(ContextCompat.getColor(divisor.context, R.color.teal_200))
            }
            com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.otros -> {
                tvCategoria.text = "Otros"
                divisor.setBackgroundColor(ContextCompat.getColor(divisor.context, R.color.teal_700))
            }
            com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.personal -> {
                divisor.setBackgroundColor(ContextCompat.getColor(divisor.context, R.color.purple_200))
                tvCategoria.text = "Personal"
            }
        }
    }
}
