package marzo04

fun main() {
    println("ingresa el primer numero")
    var num1 : Int = readLine()!!.toInt()
    println("ingresa el segundo numero")
    var num2 : Int = readLine()!!.toInt()
    val resultado : Int
    /*
    if (num1 > num2){

        resultado = num1
    }else{

        resultado = num2
    }
    println("El resultado es: $resultado")
    */
    resultado = if(num1 > num2) num1 else num2
    println("El resultado es: $resultado")
}

