package com.example.ejemplohandler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejemplohandler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener { passScreen() }
    }

    private fun passScreen() {
        val mensaje = "Texto de Ejemplo"
        val numero = 10

        //Intent o intencion para lanzar un pantalla
        //Paso de datos a traves de algo denominado un archivo temporal extras
        //Extras cada registro es en formato clave valor

        val intent = Intent(this,WelcomeActivity::class.java)
        intent.apply {
            putExtra("text", mensaje)
            putExtra("value", numero)
        }
        startActivity(intent)
    }

    private fun loadScreen() {
        Thread{

        }.start()
    }
}