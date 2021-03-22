package ejercicios
import java.lang.Math.*
import kotlin.math.pow

fun main() {
    println("-------------- MENU --------------")
    println("1: Area y Perimetro del Cuadrado")
    println("2: Area y Perimetro del Rectángulo")
    println("3: Area y Perimetro del Triángulo")
    println("4: Area y Perimetro del Círculo")
    println("5: Area y Perimetro del Rombo")
    println("6: Area y Perimetro del Trapecio")
    println("7: Area y Perimetro del Póligonos Regulares")
    println("8: Fin del programa")

    print("Elija una opcion: ")


    when (readLine()!!.toInt()) {
        1 -> {
            println("Area y Perimetro del Cuadrado")
            print("incerte un lado: ")
            val lado = readLine()!!.toDouble()
            println("El area del cuadrado es: ${lado * lado} y su perimetro es: ${lado * 4}")


        }
        2 -> {
            println("Area y Perimetro del Rectángulo")
            print("incerte la base: ")
            val base = readLine()!!.toDouble()
            print("incerte la altura: ")
            val altura = readLine()!!.toDouble()
            println("El area del rectanglo es: ${base * altura} y su perimetro es: ${(base * 2) + (altura * 2)}")
        }
        3 -> {
            println("Area y Perimetro del Triángulo")
            print("incerte la base: ")
            val base = readLine()!!.toDouble()
            print("incerte la altura: ")
            val altura = readLine()!!.toDouble()
            println("El area del Triangulo es: ${(base * altura)/2} y su perimetro es: ${base + base + base}")
        }
        4 -> {
            println("Area y Perimetro del Círculo")
            print("incerte el diametro: ")
            val diametro = readLine()!!.toDouble()
            val radio = diametro / 2
            println("El area del Circulo es: ${radio.pow(2) * PI} y su perimetro es: ${diametro * PI}")
        }
        5 -> {
            println("Area y Perimetro del Rombo")
            print("incerte el lado: ")
            val lado = readLine()!!.toDouble()
            print("incerte la altura: ")
            val altura = readLine()!!.toDouble()
            print("incerte la ancho: ")
            val ancho = readLine()!!.toDouble()
            println("El area del Rombo es: ${(ancho * altura)/2} y su perimetro es: ${lado * 4}")
        }
        6 -> {
            println("Area y Perimetro del Trapecio")
            print("incerte la Base mayor: ")
            val mayor = readLine()!!.toDouble()
            print("incerte la Base menor: ")
            val menor = readLine()!!.toDouble()
            print("incerte la altura: ")
            val altura = readLine()!!.toDouble()
            print("incerte un lado lateral del trapecio: ")
            val lado = readLine()!!.toDouble()
            println("El area del Trapecio es: ${((mayor * menor) * altura)/2} y su perimetro es: ${lado + lado + mayor + menor}")
        }
        7 -> {
            println("7: Area y Perimetro del Póligonos Regulares")
            print("incerte el numero de lados del poligono: ")
            val n = readLine()!!.toDouble()
            print("incerte la medida de un lado dek poligono: ")
            val lado = readLine()!!.toDouble()
            val teta = ((360 / (2 * n)) * (PI / 180))
            val apotema = lado/ (2 * kotlin.math.tan(teta))
            val perimetro = lado * n
            println(teta)
            println(apotema)


        println("El area del Poligono Regular es: ${(perimetro * apotema) / 2} y su perimetro es: $perimetro")
        }
        else -> print("Fin del programa")
    }


}

