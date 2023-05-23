package com.example.practica1kotlintarea;

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1kotlintarea.R

class MainActivity : AppCompatActivity() {
    private var btnPulsar: Button? = null
    private var btnLimpiar: Button? = null
    private var btnCerrar: Button? = null
    private var txtNombre: EditText? = null
    private var lbSaludo: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPulsar = findViewById<View>(R.id.btnSaludar) as Button
        btnLimpiar = findViewById<View>(R.id.btnLimpiar) as Button
        btnCerrar = findViewById<View>(R.id.btnCerrar) as Button
        txtNombre = findViewById<View>(R.id.txtNombre) as EditText
        lbSaludo = findViewById<View>(R.id.lbSaludo) as TextView
        btnPulsar!!.setOnClickListener {
            if (txtNombre!!.text.toString().equals("")) {
                Toast.makeText(this@MainActivity, "Llene todos los campos", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val mensaje = "Hola " + txtNombre!!.text.toString() + " ¿Como estas?"
                lbSaludo!!.text = mensaje
            }
        }
        btnLimpiar!!.setOnClickListener {
            txtNombre!!.setText("")
            lbSaludo!!.text = ":: ::"
        }
        btnCerrar!!.setOnClickListener { finish() }
    }
}