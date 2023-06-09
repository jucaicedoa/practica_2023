package com.jucaicedoa.appsbasicas1.apps.app3

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jucaicedoa.appsbasicas1.R

class categoriasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvCategoria: TextView = view.findViewById(R.id.tvNombreCategoria)
    private val divisor: View = view.findViewById(R.id.divisor)
    private val cvCategoria: CardView = view.findViewById(R.id.cvCategoria)
    fun render(taskCategory: taskCategory, estaSeleccionada: (Int) -> Unit) {

        val color = if (taskCategory.estaSeleccionada) {
            R.color.seleccionComponente

        } else {
            R.color.Componente
        }
        cvCategoria.setCardBackgroundColor(ContextCompat.getColor(cvCategoria.context, color))

        itemView.setOnClickListener { estaSeleccionada(layoutPosition) }

        when (taskCategory) {
            com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.negocios -> {
                tvCategoria.text = "Negocios"
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.teal_200
                    )
                )
            }

            com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.otros -> {
                tvCategoria.text = "Otros"
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.teal_700
                    )
                )
            }

            com.jucaicedoa.appsbasicas1.apps.app3.taskCategory.personal -> {
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.purple_200
                    )
                )
                tvCategoria.text = "Personal"
            }
        }
    }
}
