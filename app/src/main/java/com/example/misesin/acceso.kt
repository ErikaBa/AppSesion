package com.example.misesin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class acceso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceso)
    }

    fun infocompleta(view: View) {
        val informacion = Intent(this@acceso, DatosCompletos::class.java)
        startActivity(informacion)
    }

    fun infoescuela(view: View) {
        val informacionescuela = Intent(this@acceso, Escuela::class.java)
        startActivity(informacionescuela)
    }

    fun materias(view: View) {
        val asignaturas = Intent(this@acceso, Asignaturas::class.java)
        startActivity(asignaturas)
    }

    fun notificaciones(view: View) {
        val avisos = Intent(this@acceso, Avisos::class.java)
        startActivity(avisos)
    }

    fun aplicacion(view: View) {
        val appinfo = Intent(this@acceso, Acercade::class.java)
        startActivity(appinfo)
    }
}