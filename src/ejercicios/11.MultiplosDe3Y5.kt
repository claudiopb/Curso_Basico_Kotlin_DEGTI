package ejercicios

fun main() {
    var cont3 = 0
    var cont5 = 0


    println("Incerta 10 numeros enteros")
    for (i in 1..10) {
        print("incerta el $i numero: ")
        val numero = readLine()!!.toInt()
        val mult3 = numero % 3
        val mult5 = numero % 5

        if (mult3 == 0 && mult5 == 0) {
            cont3++
            cont5++
        }else if (mult3 == 0){
            cont3++
        }else if (mult5 == 0){
            cont5++
        }
    }
    println("Total de multiplos de 3 $cont3")
    println("Total de multiplos de 5 $cont5")
}

