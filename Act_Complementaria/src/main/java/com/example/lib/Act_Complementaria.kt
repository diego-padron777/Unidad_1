package com.example.lib

fun esMayorDeEdad(edad: Int): Boolean
{
    return edad >= 18
}

fun main() {

    println("<<<<<<<<<<<<<< Registro simple de usuarios >>>>>>>>>>>>>>>")

    // Datos del usuario
    val nombre: String = "Diego"
    val edad: Int = 22
    val email: String? = null
    val suscripcionActiva: Boolean = true

    println("\n######### Datos del usuario #########")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Suscripcion activa: $suscripcionActiva")

    // Evaluación con if / else
    if (esMayorDeEdad(edad))
    {
        println("Acceso permitido")
    }
    else
    {
        println("Acceso denegado")
    }

    // Null safety (operador Elvis ?:)
    val emailMostrado = email ?: "Email no registrado"
    println("Email: $emailMostrado")

    // Lista de usuarios
    val usuarios = mutableListOf<String>()

    usuarios.add("Kemonito")
    usuarios.add("Jordi")
    usuarios.add("Shinji")

    println("\nLista de usuarios registrados:")
    for (usuario in usuarios) {
        println(usuario)
    }

    // Uso de when
    val categoria = when {
        edad < 13 -> "Niño"
        edad in 13..17 -> "Adolescente"
        edad in 18..64 -> "Adulto"
        else -> "Adulto mayor"
    }

    println("\nClasificacion por edad: $categoria")
}