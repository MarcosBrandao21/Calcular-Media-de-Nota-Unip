package com.marcos.calculodenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.Calcular as Calcular1
import kotlinx.android.synthetic.main.activity_main.resultado as resultado1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Calcular :Button = Calcular1
        val resultado :TextView = resultado1

        Calcular.setOnClickListener{
            val nota1 = Integer.parseInt(Nota1.text.toString())
            val nota2 = Integer.parseInt(Nota2.text.toString())
            val pim = Integer.parseInt(Pim.text.toString())

            // Calculo da media
            val media = (nota1 * 0.4) + (nota2 * 0.4) + (pim * 0.2)

            if(media in 0.0..10.0) {
                if (media >= 4.8) {
                resultado1.setText("Aluno foi Aprovado" + "\n" + "Nota Final: " + media + "\n")
                resultado.setTextColor(Color.GREEN)
                } else {
                resultado1.setText("Aluno foi Reprovado" + "\n" + "Nota Final: " + media + "\n")
                resultado.setTextColor(Color.RED)
                }
            } else{
                resultado1.setText("Inserir Valor Valido!")
                resultado.setTextColor(Color.RED)
            }

            // Limpar os campos

            Nota1.text = null
            Nota2.text = null
            Pim.text = null
        }
    }
}