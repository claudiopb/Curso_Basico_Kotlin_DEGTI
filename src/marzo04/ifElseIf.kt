package marzo04

fun main() {
    println("Calificacion de Prog: ")
    val calProg : Int = readLine()!!.toInt()

    println("Calificacion de Mat: ")
    val calMate : Int = readLine()!!.toInt()

    println("Calificacion de Poo: ")
    val calPoo : Int = readLine()!!.toInt()

    println("Calificacion de BD: ")
    val calBd : Int = readLine()!!.toInt()

    val promedio : Int = (calProg + calMate + calPoo + calBd) / 4

    if (promedio == 10){
        println("Tu resultado es sobresaliente ¡Felicidades! Tu promedio es $promedio")
        }else if (promedio == 9){
        println("Tu resultado es bueno ¡Felicidades! Tu promedio es $promedio")
        //       (promedio >= 6 && promedio <= 8
        }else if (promedio in 6..8){
        println("Tu resultado es suficiente ¡Felicidades! Tu promedio es $promedio")
    }else{
        println("Tu resultado es insuficiente ¡Echale ganas! Tu promedio es $promedio")
    }
}

