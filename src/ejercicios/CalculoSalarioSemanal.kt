package ejercicios

fun main() {
    print("Ingresa numero de Horas trabajadas: ")
    val horas = readLine()!!.toDouble()
    println("")

    print("Ingresa el Pago de salario minimo por hora: ")
    val salarioMinimo = readLine()!!.toDouble()
    println("")
    var total : Double?
    if (horas > 40){
    val horasExtras = horas - 40
     total = horasExtras * (salarioMinimo * 2) + (40 * salarioMinimo)
     println("El pago total por ${horas} horas trabajadas mas $horasExtras horas extras es: $total ")
    }else {
        total = horas * salarioMinimo
        println("Su Pago total de $horas trabajadas es: $total")
    }

}

