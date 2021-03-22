package ejercicios

fun main() {
    var i = 1
    var fac = 1

    println("Calcula el Factortial de un numero con Ciclos While")

    print("incerta el numero a calcular: ")
    val numero = readLine()!!.toInt()

    while (i <= numero ){
        fac *= i
        i++

    }
    println("El Facrorial de $numero! es: $fac")
}

