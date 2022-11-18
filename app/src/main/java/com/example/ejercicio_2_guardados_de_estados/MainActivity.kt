package com.example.ejercicio_2_guardados_de_estados

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0

    private lateinit var contenido : EditText
    private lateinit var contenido2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate ${onCreate+1}")

        contenido= findViewById(R.id.editTextTextPersonName3)
        contenido2=findViewById(R.id.editTextTextPersonName4)

        println(contenido)
        println(contenido2)
    }


    override fun onStart() {
        super.onStart()

        println("onStart ${onStart+1}")
    }
    override fun onResume(){
        super.onResume()

        println("onResume ${onResume+1}")
    }
    override fun onPause(){
        super.onPause()

        println("onPause ${onPause+1}")
    }
    override fun onStop(){
        super.onStop()

        println("onStop ${onStop+1}")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("Algo",contenido.text.toString())

        savedInstanceState.putString("Algo2",contenido2.text.toString())


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        contenido.setText(savedInstanceState.getString("Algo"))
        contenido2.setText(savedInstanceState.getString("Algo2"))

    }
}