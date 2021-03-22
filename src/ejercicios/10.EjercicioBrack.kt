package ejercicios

fun main() {

    var sum = 0
    for (i in 1..99) {
        print("Ingresa un numero difrente de 0 para sumar ")
       val num = readLine()!!.toInt()
        if (num == 0) {
            break
        }

        sum += num
    }
    println(sum)
}

