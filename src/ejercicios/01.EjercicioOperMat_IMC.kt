package ejercicios

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    print("Ingresa su peso en kilogramos: ")
    val pesoEnKilogramos : Double = readLine()!!.toDouble()
    println("")
    print("Ingresa su altura en metros: ")
    val alturaEnMetros : Double = readLine()!!.toDouble()
    println("")
    val bMI = pesoEnKilogramos / (alturaEnMetros * alturaEnMetros)

    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING


     if(bMI <= 18.5){
         println("Su BMI es: ${df.format(bMI)} ustes esta bajo de peso")
     }else if (bMI in 18.5..24.9){
         println("Su BMI es: $df.format(bMI) su peso es normal")

     }else if (bMI in 25.toDouble()..29.9){
         println("Su BMI es: ${df.format(bMI)} ustes tiene Sobrepeso")
     }else{
         println("Su BMI es: ${df.format(bMI)} ustes tiene obesidad")
     }

}

