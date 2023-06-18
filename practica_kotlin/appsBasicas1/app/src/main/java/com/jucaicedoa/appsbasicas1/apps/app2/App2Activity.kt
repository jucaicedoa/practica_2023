package com.jucaicedoa.appsbasicas1.apps.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.slider.RangeSlider
import com.jucaicedoa.appsbasicas1.R
import java.text.DecimalFormat

class App2Activity : AppCompatActivity() {
    //Definimos variables generales para interactuar en las diferentes funciones
    private var estaSeleccHombre: Boolean = true
    private var estaSeleccMujer: Boolean = false
    private lateinit var vistaHombre: CardView
    private lateinit var vistaMujer: CardView
    private lateinit var textoAltura: TextView
    private lateinit var rsAltura:RangeSlider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app2)
        iniciarComponentes()
        iniciarListeners()
        iniciUI()
    }
    //Iniciar componentes
    private fun iniciarComponentes() {
        vistaHombre = findViewById(R.id.vistaHombre)
        vistaMujer = findViewById(R.id.vistaMujer)
        textoAltura = findViewById(R.id.textoAltura)
        rsAltura = findViewById(R.id.rsAltura)
    }
    //Iniciar acciones en los componentes
    private fun iniciarListeners() {
        vistaHombre.setOnClickListener {
            cambiarEstado()
            setColorVistas()
        }
        vistaMujer.setOnClickListener {
            cambiarEstado()
            setColorVistas()
        }
        rsAltura.addOnChangeListener{_,value,_->
            val df = DecimalFormat("#.##")
            val resultado = df.format(value)
            textoAltura.text = "$resultado cm"
        }
    }
    //Cambiar Color vistas
    private fun setColorVistas() {
        vistaHombre.setCardBackgroundColor(getBackgroundSelecc(estaSeleccHombre))
        vistaMujer.setCardBackgroundColor(getBackgroundSelecc(estaSeleccMujer))
    }
    //Cambiar el estado de las vistas
    private fun cambiarEstado() {
        estaSeleccHombre = !estaSeleccHombre
        estaSeleccMujer = !estaSeleccMujer
    }
    //Obtener el color para cambiar
    private fun getBackgroundSelecc(estaSelecc: Boolean): Int {
        val referenciaColor = if (estaSelecc) {
            R.color.seleccionComponente
        } else {
            R.color.Componente
        }
        return ContextCompat.getColor(this, referenciaColor)
    }
    //Iniciar interfaz
    private fun iniciUI() {
        setColorVistas()
    }

}