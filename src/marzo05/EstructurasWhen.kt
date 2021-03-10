package marzo05

fun main() {
    val x = 1

    when (x) {
    1 -> {
            println("El valor es 1")
            println("Esta es una accion agregada")
        }
    2 -> println("El valor es 2")
    3 -> println("El valor es 3")
    in 5..15 -> println("El valor esta entre 5 y 15")
    !in 5..15 -> println("El valor no esta entre 5 y 15")
    else -> println("El valor esta fuera de rango")
    }
    // when como esprecion se pueden omitir los print
    val resultado = when (x) {
        1 -> "El Valor es 1"
        2 -> "El valor es 2"
        3 -> "El valor es 3"
        in 5..15 -> "El valor esta entre 5 y 15"
        !in 5..15 -> "El valor no esta entre 5 y 15"
        else -> "El valor esta fuera de rango"
    }
    println(" el resultado es: $resultado")

    println("Calificacion de Prog: ")
    val calProg : Int = readLine()!!.toInt()

    println("Calificacion de Mat: ")
    val calMate : Int = readLine()!!.toInt()

    println("Calificacion de Poo: ")
    val calPoo : Int = readLine()!!.toInt()

    println("Calificacion de BD: ")
    val calBd : Int = readLine()!!.toInt()

    val promedio : Double = (calProg + calMate + calPoo + calBd) / 4.toDouble()

    when(promedio){
        in 9.5..10.0 -> "el resultado es sobresaliente ¡Felicidsdes¡ tu promedio es de $promedio"
        in 9.0..9.49 -> "el resultado es bueno, ¡Muy bien¡ tu promedio es de $promedio"
        in 6.0..8.99 -> "el resultado es duficiente, ¡Bien¡ tu promedio es de $promedio"
        else -> "el resultado es insuficiente, ¡Echale ganas¡ tu promedio es de $promedio"


    }

    println("Ingresa el caracter para imprimir el día: ")
    val caracter : Char = readLine()!![0]
    when(caracter){
            'L', 'l' -> println("El día es lunes.")
            'M', 'm' -> println("El día es martes.")
            'X', 'x' -> println("El día es miércoles.")
            'J', 'j' -> println("El día es jueves.")
            'V', 'v' -> println("El día es viernes.")
            'S', 's' -> println("El día es sábado.")
            'D', 'd' -> println("El día es domingo.")
    }

}

