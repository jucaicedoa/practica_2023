package com.jucaicedoa.appsbasicas1.apps.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.jucaicedoa.appsbasicas1.R
import com.jucaicedoa.appsbasicas1.apps.app2.App2Activity.Companion.IMC
import org.w3c.dom.Text

class ResultadoApp2Activity : AppCompatActivity() {

    private lateinit var tvResultado: TextView
    private lateinit var tvImc: TextView
    private lateinit var tvDetalle: TextView
    private lateinit var botonRecalcu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_app2)
        val resultado = intent.extras?.getDouble(IMC) ?: -1.0
        iniciarComponentes()
        initUI(resultado)
        iniciarListeners()
    }

    //Inicio acciones
    private fun iniciarListeners() {
        botonRecalcu.setOnClickListener { onBackPressed() }
    }

    //Inicio UI
    private fun initUI(resultado: Double) {
        tvImc.text = resultado.toString()
        when (resultado) {
            in 0.00..18.50 -> {
                tvResultado.setTextColor(ContextCompat.getColor(this, R.color.bajoPeso))
                tvResultado.text = getString(R.string.tituloBajoPeso)
                tvDetalle.text = getString(R.string.detalleBajoPeso)
            }

            in 18.51..24.99 -> {
                tvResultado.setTextColor(ContextCompat.getColor(this, R.color.pesoNormal))
                tvResultado.text = getString(R.string.titulonormalPeso)
                tvDetalle.text = getString(R.string.detalleNormalPeso)
            }

            in 25.0..29.99 -> {
                tvResultado.setTextColor(ContextCompat.getColor(this, R.color.sobrePeso))
                tvResultado.text = getString(R.string.tituloSobrePeso)
                tvDetalle.text = getString(R.string.detalleSobrePeso)
            }

            in 30.00..99.00 -> {
                tvResultado.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvResultado.text = getString(R.string.tituloObesidad)
                tvDetalle.text = getString(R.string.detallObesidad)
            }

            else -> {
                tvImc.text = getString(R.string.error)
                tvResultado.text = getString(R.string.error)
                tvDetalle.text = getString(R.string.error)
            }

        }
    }

    //Iniciar componentes
    private fun iniciarComponentes() {
        tvResultado = findViewById(R.id.tvResultado)
        tvImc = findViewById(R.id.tvValorImc)
        tvDetalle = findViewById(R.id.tvDetalle)
        botonRecalcu = findViewById(R.id.botonReCalcular)
    }
}
