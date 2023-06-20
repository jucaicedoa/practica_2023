package com.jucaicedoa.appsbasicas1.apps.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.jucaicedoa.appsbasicas1.R
import java.text.DecimalFormat

class App2Activity : AppCompatActivity() {
    //Definimos variables generales para interactuar en las diferentes funciones
    private var pesoInicial: Int = 70
    private var edadInicial: Int = 23
    private var alturaInicial: Int = 120
    private var estaSeleccHombre: Boolean = true
    private var estaSeleccMujer: Boolean = false
    private lateinit var vistaHombre: CardView
    private lateinit var vistaMujer: CardView
    private lateinit var tvPeso: TextView
    private lateinit var tvEdad: TextView
    private lateinit var textoAltura: TextView
    private lateinit var rsAltura: RangeSlider
    private lateinit var botonCalcular: Button
    private lateinit var botonRegreso: Button
    private lateinit var botonRestaPeso: FloatingActionButton
    private lateinit var botonSumaPeso: FloatingActionButton
    private lateinit var botonSumaEdad: FloatingActionButton
    private lateinit var botonRestaEdad: FloatingActionButton

    //Acceder a constante desde otros archivos
    companion object {
        const val IMC = "IMC_RESULTADO"
    }

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
        botonRestaPeso = findViewById(R.id.botonRestaPeso)
        botonSumaPeso = findViewById(R.id.botonSumaPeso)
        tvPeso = findViewById(R.id.tvPeso)
        botonRestaEdad = findViewById(R.id.botonRestaEdad)
        botonSumaEdad = findViewById(R.id.botonSumaEdad)
        tvEdad = findViewById(R.id.tvEdad)
        botonCalcular = findViewById(R.id.botonCalcular)
        botonRegreso = findViewById(R.id.botonRegreso)
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
        rsAltura.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            alturaInicial = df.format(value).toInt()
            textoAltura.text = "$alturaInicial cm"
        }

        botonRestaPeso.setOnClickListener {
            pesoInicial -= 1
            setPeso()
        }
        botonSumaPeso.setOnClickListener {
            pesoInicial += 1
            setPeso()
        }
        botonRestaEdad.setOnClickListener {
            edadInicial -= 1
            setEdad()
        }
        botonSumaEdad.setOnClickListener {
            edadInicial += 1
            setEdad()
        }
        botonCalcular.setOnClickListener {
            val resultado = calcularImc()
            navegarResultado(resultado)
        }
        botonRegreso.setOnClickListener { onBackPressed() }
    }

    //Intent para activity resultadoApp2
    private fun navegarResultado(resultado: Double) {
        val intent = Intent(this, ResultadoApp2Activity::class.java)
        intent.putExtra(IMC, resultado)
        startActivity(intent)
    }

    //Calcular imc
    private fun calcularImc(): Double {
        val df = DecimalFormat("#.##")
        val imc = pesoInicial / (alturaInicial.toDouble() / 100 * alturaInicial.toDouble() / 100)
        return df.format(imc).toDouble()
    }

    //Cambio edad
    private fun setEdad() {
        tvEdad.text = edadInicial.toString()
    }

    //Cambio peso
    private fun setPeso() {
        tvPeso.text = pesoInicial.toString()
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
        setPeso()
        setEdad()
    }
}
