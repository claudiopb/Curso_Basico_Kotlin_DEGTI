package marzo04

fun main() {
    println(2>3 && 5>20) // && and solo se pasa si los dos son verdaderos
    println(2>3 || 5>20) // || or cualquiera de las dos sean verdaderas pasa

    val num2 = true
    println(!num2)

    println((2 < 3 && 5 > 20) && (3 <= 3 && 5 > 4))
    println((2 < 3 && 5 > 20) || (3 <= 3 && 5 > 4))
}

