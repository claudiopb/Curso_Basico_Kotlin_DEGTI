package mzrzo03

fun main() {

    println("¿Cual es tu nombre?")
val nombre: String? = readLine()
    println(nombre)


println("¿Cual es tu edad?")
val  edad : Int = readLine()!!.toInt()
    println(edad)

}

