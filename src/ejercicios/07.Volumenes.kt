package ejercicios

import kotlin.math.pow

fun main() {
    println("--------- MENU ---------")
    println("1: Volumen de un Cubo")
    println("2: Volumen de un Pirámide")
    println("3: Volumen de un Cilindro")
    println("4: Volumen de un Cono")
    println("5: Volumen de una Esfera")
    println("6: Fin del programa")

    print("Elija una opcion: ")

    when (readLine()!!.toInt()) {
        1 -> {
            println("Volumen de un Cubo")
            print("incerte un lado de la base: ")
            val lado = readLine()!!.toDouble()
            print("incerte la altura del cubo: ")
            val altura = readLine()!!.toDouble()
            println("El volumen del Cubo es: ${(lado * lado) * altura}")


        }
        2 -> {
            println("Volumen de un Pirámide")
            print("incerte el lado de la base: ")
            val lado = readLine()!!.toDouble()
            print("incerte la altura de la piramide: ")
            val alturaPiramide = readLine()!!.toDouble()
            println("El Volumen de la Piramide es: ${(lado * lado * alturaPiramide)/3}")
        }
        3 -> {
            println("Volumen de un Cilindro")
            print("incerte el radio de la base: ")
            val radio = readLine()!!.toDouble()
            print("incerte la altura del cilindro: ")
            val altCilindro = readLine()!!.toDouble()
            println("El Volumen del Cilindro es: ${(radio.pow(2) * Math.PI) * altCilindro}")
        }
        4 -> {
            println("Volumen de un Cono")
            print("incerte el radio de la base: ")
            val radio = readLine()!!.toDouble()
            print("incerte la altura del cono: ")
            val altCono = readLine()!!.toDouble()
            println("El Volumen del Cono es: ${((radio.pow(2) * Math.PI) * altCono)/3}")
        }
        5 -> {
            println("Volumen de una Esfera")
            print("incerte el radio de la esfera: ")
            val radio = readLine()!!.toDouble()
            println("El Volumen del Esfera es: ${((4 * radio.pow(3) * Math.PI))/3}")
        }
        else -> print("Fin del programa")
    }
}

