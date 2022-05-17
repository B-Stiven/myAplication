package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var campoTexto: EditText?=null
    var txtResultado: TextView?=null
    var campoDireccion: EditText?=null
    var campoEmail: EditText?=null
    var campoTelefono: EditText?=null
    var campoDocumento: EditText?=null
    var campoEdad: EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botton: Button = findViewById(R.id.saludar)
        botton.setOnClickListener{onclick()}


        campoTexto=findViewById(R.id.editPerson)
        campoDireccion=findViewById(R.id.idaddres)
        campoEmail=findViewById(R.id.idemail)
        campoTelefono=findViewById(R.id.idphone)
        campoDocumento=findViewById(R.id.idcc)
        campoEdad=findViewById(R.id.idage)
        txtResultado=findViewById(R.id.resultado)

    }

    private fun onclick(){
        var nombre:String=campoTexto!!.text.toString()
        var direccion:String=campoDireccion!!.text.toString()
        var email:String=campoEmail!!.text.toString()
        var telefono:String=campoTelefono!!.text.toString()
        var documento:String=campoDocumento!!.text.toString()
        var age:String=campoEdad!!.text.toString()
        var edad=Integer.parseInt(age)
        var msj:String=""

        if (edad<=10){
            var msj:String="Bienvenido $nombre \n tu documento $documento  \n tu edad $edad  eres un infante \n"+" tu telefono $telefono \n tu e-mail $email \n tu dirección $direccion"
            txtResultado!!.text= msj
            Toast.makeText(this,"Bienvenido $nombre eres un infante", Toast.LENGTH_SHORT).show()
        }else if(edad<=11 && edad<=18){
            var msj:String="Bienvenido $nombre \n tu documento $documento  \n tu edad $edad  eres un Adolecente \n"+" tu telefono $telefono \n tu e-mail $email \n tu dirección $direccion"
            txtResultado!!.text= msj
            Toast.makeText(this,"Bienvenido $nombre eres un Adolecente", Toast.LENGTH_SHORT).show()
        }else if(edad>18 && edad<=60){
            var msj:String="Bienvenido $nombre \n tu documento $documento  \n tu edad $edad  eres un Adulto \n"+" tu telefono $telefono \n tu e-mail $email \n tu dirección $direccion"
            txtResultado!!.text= msj
            Toast.makeText(this,"Bienvenido $nombre eres un Adulto", Toast.LENGTH_SHORT).show()
        }else if(edad>60 && edad<=80){
            var msj:String="Bienvenido $nombre \n tu documento $documento  \n tu edad $edad  eres un Adulto mayor \n"+" tu telefono $telefono \n tu e-mail $email \n tu dirección $direccion"
            txtResultado!!.text= msj
            Toast.makeText(this,"Bienvenido $nombre eres un Adulto mayor", Toast.LENGTH_SHORT).show()
        }


    }
}

