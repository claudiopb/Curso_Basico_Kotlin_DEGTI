package ejercicios

fun main() {
    println("Ingrese 3 numeros para calcular su promedio")
    print("Ingresa el numero 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingresa el numero 2: ")
    val n2 = readLine()!!.toInt()
    print("Ingresa el numero 3: ")
    val n3 = readLine()!!.toInt()
    println("El promedio es: ${promedio(n1, n2, n3)}")
}

fun promedio(num1: Int, num2: Int, num3: Int): Int {
    return (num1 + num2 + num3) / 3
}
