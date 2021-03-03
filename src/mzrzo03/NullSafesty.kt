package mzrzo03

fun main() {

    // ? Sirve para que una variable acepte valores nulos sin mrcar errores
    val nombre : String?
    nombre = null
    println(nombre)

    // !! despues de una variable no permite que tenga valores nulos
    // Fuersa a que le llegue la variable con un valor
    val nombre2 : String?
    nombre2 = "Claudio"
    println(nombre2!!)


}

