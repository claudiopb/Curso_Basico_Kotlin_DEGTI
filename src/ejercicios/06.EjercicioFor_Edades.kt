package ejercicios

fun main() {

    var edadesMat = 0
    var edadesVesp = 0
    var edadesNoc = 0

    for (i in 1..18) {
        when {
            i <= 5 -> {
                print("incerte la edad de alumno $i turno Matutino: ")
                val edad = readLine()!!.toInt()
                edadesMat += edad
            }
            i in 6..11 -> {
                val aux = i - 5
                print("incerte la edad de alumno $aux turno Vestertino: ")
                val edad = readLine()!!.toInt()
                edadesVesp += edad
            }
            else -> {
                val aux = i - 11
                print("incerte la edad de alumno $aux turno Nocturno: ")
                val edad = readLine()!!.toInt()
                edadesNoc += edad
            }
        }
    }
    val promMat = edadesMat / 5
    val promVesp = edadesVesp / 6
    val promNoc = edadesNoc / 7

    println("El promedio de las edades del Turno de la Mañana es: $promMat")
    println("El promedio de las edades del Turno de la Tarde es: $promVesp")
    println("El promedio de las edades del Turno de la Noche es: $promNoc")
    if (promMat > promVesp && promMat > promNoc) {
        println("El promedio del edades del turno de la mañana es mayor: $promMat")
    } else if (promVesp > promNoc) {
        println("El promedio del edades del turno de la tarde es mayor: $promVesp")
    } else println("El promedio del edades del turno de la noche es mayor: $promNoc")
}

