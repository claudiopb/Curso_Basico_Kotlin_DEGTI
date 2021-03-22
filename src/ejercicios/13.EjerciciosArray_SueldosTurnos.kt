package ejercicios

fun main() {
    val arrayManana = DoubleArray(4)
    val arrayTarde = DoubleArray(4)
    var sumaSueldoM  = 0.0
    var sumaSueldoT  = 0.0

    for (i in 0..3){

        print("Ingresa el sueldo del empleado turno de la mañana N.o ${i + 1}: ")
        val sueldoM = readLine()!!.toDouble()
        arrayManana[i] = sueldoM
        sumaSueldoM += arrayManana[i]
    }

    for (i in 0..3){
        print("Ingresa ll sueldo del empleado turno de la Tarde N.o ${i + 1}: ")
        val sueldoM = readLine()!!.toDouble()
        arrayTarde[i.toInt()] = sueldoM
        sumaSueldoT += arrayTarde[i]
    }
    println("Los gastos en sueldos del turno de mañana son ${arrayManana.sum()}")
    println("Los gastos en sueldos del turno de Tarde son ${arrayTarde.sum()}")


}

