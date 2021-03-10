package ejercicios

fun main() {
    var suma = 0
    println("Incerta 10 numeros")
    for (i in 1..10) {
        print("incerta el $i numero: ")
        val numero = readLine()!!.toInt()
        if (i > 5) {
            suma += numero
        }
    }
    println("La suma de los 5 ultimos numeros es: $suma")
}

