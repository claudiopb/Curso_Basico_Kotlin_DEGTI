package ejercicios

fun main() {
    var suma = 0
 //   var num?
    do {
        print("Ingresa un numero difrente de 0 para sumar ")
      val  num = readLine()!!.toInt()
        suma += num
    } while (num != 0)
    println("La suma total es $suma")
}

