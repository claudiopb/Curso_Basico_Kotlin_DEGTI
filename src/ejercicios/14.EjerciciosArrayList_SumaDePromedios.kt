package ejercicios

fun main() {
    val arrayList = ArrayList<Int>()
    do {
        print("Ingresa un numero: ")
        val num = readLine()!!.toInt()
        if (num != 0) {
            arrayList.add(num)
        }
    } while (num != 0)
    println("Suma de los enteros en el arreglo: ${arrayList.sum()}")
    println("Promedio de los enteros en el arreglo ${arrayList.average()}")
}

