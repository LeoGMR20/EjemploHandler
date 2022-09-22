package com.example.ejemplohandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejemplohandler.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //si esta pantalla ha sido lanzada producto de una intencion
        //en un objeto llamado intent queda ese registro utilizado
        val mensaje = """
            el texto es: ${intent.getStringExtra("text")}
            el número: ${intent.getIntExtra("value",0)}
        """.trimIndent()
        binding.tvResult.text = mensaje
    }
}