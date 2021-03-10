package marzo05

fun main() {
    println("Nombre del alumno")
    val NomAlu = readLine()
    println("Ingresa la califucacion del primer parcial")
    val calPar1 = readLine()!!.toDouble()
    println("Ingresa la califucacion del segundo parcial")
    val calPar2 = readLine()!!.toDouble()
    println("Ingresa la califucacion del tercer parcial")
    val calPar3 = readLine()!!.toDouble()

    val prom = (calPar1 + calPar2 + calPar3) / 3

    //exento
    if (prom >= 9.5) {
        println("El alumno $NomAlu esta, exento por que su promedio es $prom")
    }

    // ordinario
    if (prom >= 6.0 && prom < 9.5) {
        println("El Alumno $NomAlu esta en ordinario, por que su promedio es $prom")

        println("Calificacion del ordinario")
        val calOrd = readLine()!!.toDouble()
        val ordinario = (prom + calOrd) / 2

        if (ordinario >= 6) {
            println("El Alumno $NomAlu,esta libre del ordinario, su promedio es $ordinario")
        } else {
            println("El alumno $NomAlu, esta reprobado y ha perdido sus oportunidades dedo que su promedio es $ordinario")
        }
    }
    // extraordinario
    if (prom < 6) {
        println("El alumno $NomAlu, esta libre de extraordinario, su calificacion es $prom")

        println("Calificacion del extraordinario")
        val calExtra = readLine()!!.toDouble()

        if (calExtra >= 6) {

            println("El alumno $NomAlu, esta libre de estraordinario, su promedio es $calExtra")

        } else {
            println("El alumno $NomAlu reprobo el extraordinario promedio $calExtra")
        }
    }

}

