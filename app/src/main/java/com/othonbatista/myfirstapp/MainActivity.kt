package com.othonbatista.myfirstapp

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }

    fun toastMe (v : View) {

        // Cria um Toast para exibir a mensagem
        var toast = Toast.makeText(this, "Teste de Toast!!!", Toast.LENGTH_LONG)

        // Muda a cor do fundo do Toast
        toast.view.setBackgroundColor(Color.YELLOW)

        // Recupera a mensagem como um TextView
        val texto = toast.view.findViewById<TextView>(android.R.id.message)

        // Muda a cor do texto
        texto.setTextColor(Color.BLACK)

        // Exibe o Toast
        toast.show()

    }

    fun countMe (v : View) {

        // Recupera o TextView com o número da tela
        val numeroTextView = findViewById<TextView>(R.id.textViewNumero)

        // Cria uma variável para realizar a contagem e atribui o valor atual do texto do TextView
        var numero = Integer.parseInt(numeroTextView.text.toString())

        // Adiciona 1 ao número
        ++ numero;

        // Atribui à propriedade text do TextView o número calculado transformado em String
        numeroTextView.setText(numero.toString())

    }

    fun randonMe (v : View) {

        // Recupera o TextView com o número da tela
        val numeroTextView = findViewById<TextView>(R.id.textViewNumero)

        // Cria uma constante para a nova tela (Intent)
        val randomIntent = Intent (this, SecondActivity::class.java)

        // Pega o valor atual do textview
        val countString = numeroTextView.text.toString()

        // Converte a string lida do textview para int
        val count = Integer.parseInt(countString)

        // Adiciona o parâmetro à segunda tela
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Abre a nova tela
        startActivity(randomIntent)

    }

}
