package ejercicios

fun main() {
    var t1 = 0
    var t2 = 1

    println("Serie de Fibonacci con Ciclos While")

    print("incerta el numero hasta donde quieres que llegue la serie Fibonacci: ")
    val numero = readLine()!!.toInt()

    while (t1 <= numero ){
        print("$t1 ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

