package com.othonbatista.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {

        const val TOTAL_COUNT = "total_count"

    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        showRandomNumber()

    }

    fun showRandomNumber() {

        // Recupera o TextView com o número da tela
        val numeroTextView = findViewById<TextView>(R.id.textViewRandoNumber)

        // Recupera o TextView com a mensagem
        val mensagemTextView = findViewById<TextView>(R.id.textViewMessage)

        // Lê o valor de count
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // Gera o número randômico
        val random = Random()

        var randomInt = 0

        // Adiciona 1 ao final
        if (count > 0) {

            randomInt = random.nextInt(count + 1)
        }

        // Mostra o número randômico
        numeroTextView.text = Integer.toString(randomInt)

        // Substitui o valor máximo na string
        // para o cabeçalho e atualiza o textview
        mensagemTextView.text = getString(R.string.random_heading, count)

    }
}
