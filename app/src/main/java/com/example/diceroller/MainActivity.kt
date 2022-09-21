package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
            class MainActivity : AppCompatActivity() {
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_main)
                    val rollButton: Button = findViewById(R.id.botaoPrincipal)
                    rollButton.setOnClickListener { rolldice() }
                        fun rollDice() {
                            val randomInt = (1..6).random()
                            val resultText: TextView = findViewById(R.id.ResultadoTexto)
                            resultText.text = randomInt.toString()
                        }
                    }

                private fun rolldice() {
                    TODO("Not yet implemented")
                }
            }
            }

