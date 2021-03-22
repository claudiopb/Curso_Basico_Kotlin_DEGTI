package ejercicios

fun main() {
    print("¿Cuántas alturas deseas capturar?: ")
    val cantAlturas = readLine()!!.toInt()
    val arrayAlturas = FloatArray(cantAlturas)
    var sumaAlturas = 0.0f
    var mayoresAPromedio = 0
    var menoresAPromedio = 0
    for (i in arrayAlturas.indices){
        print("Ingresa la altura $i: ")
        val altura = readLine()!!.toFloat()
        arrayAlturas[i] = altura
        sumaAlturas += arrayAlturas[i]
    }
    val promedio = sumaAlturas / cantAlturas
    println("El promedio de alturas es: $promedio")
    for (i in arrayAlturas.indices){
        if (arrayAlturas[i] > promedio){
            mayoresAPromedio++
        } else {
            menoresAPromedio++
        }
    }
    println("Las personas mayores al promedio son: $mayoresAPromedio")
    println("Las personas menores al promedio son: $menoresAPromedio")
}



