package marzo03

fun main() {
    println("Ingresa el primer numero")
    val num1 :Int = readLine()!!.toInt()
    println("Ingresa el primer numero")
    val num2 : Int = readLine()!!.toInt()

    val res : Int = num1 + num2

    println("El resultado es: $res")

    println("Ingresa el primer numero Double")
    val num1dob :Double = readLine()!!.toDouble()
    println("Ingresa el segunda numero Double")
    val num2dob : Double = readLine()!!.toDouble()

    val resdob = num1dob + num2dob

    println("El resultado de numeros Double es: $resdob")

    val jerarquia = num1 + num2 * num2dob - 1
    val jerarquia2 = num1 + num2 * num2dob - 1
    val jerarquia3 = num1 / (num2 * num2dob) - 1


    println("El resultado de esta operacion 1 es: $jerarquia")
    println("El resultado de esta operacion 2 es: $jerarquia2")
    println("El resultado de esta operacion 3 es: $jerarquia3")
}

