package ejercicios

fun main() {
    var suma = 0
    val flag = true
    //   var num?
    do {
        print("Ingresa un numero difrente de 0 para sumar ")
        val  num = readLine()!!.toInt()
        if(num <= 0) {
            continue
        }
        suma += num

    } while (num != 0)
    println("La suma total es $suma")
}

