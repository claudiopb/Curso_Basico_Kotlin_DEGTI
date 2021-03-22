package ejercicios

fun main() {
    print("Ingresa el sueldo de operario: ")
    val sueldo = readLine()!!.toDouble()
    println("")

    print("Ingresa al antigüedad del operario: ")
    val antiguadad = readLine()!!.toInt()
    println("")
    var total : Double?
     if(sueldo < 5000 && antiguadad >= 10){
         total = sueldo + (sueldo * 0.20)
         println("Se le otorga un aumento de 20%, su sueldo a pagar es: $total ")
     }else if(sueldo < 5000 && antiguadad < 10){
         total = sueldo + (sueldo * 0.05)
         println("Se le otorga un aumento de 5%, su sueldo a pagar es: $total ")
     }else println("El sueldo es: $sueldo")

}

