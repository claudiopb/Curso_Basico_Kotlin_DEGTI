package marzo11

fun main() {
    suma(2,2)
}
/*
fun powerOf (numero : Int, exonente : Int) : Int{
    return numero
}
*/
fun printHello (nombre : String?) : Unit {
    if (nombre != null) {
        println("Hola $nombre")
    } else {
        println("Hola")
    }
}
    fun suma(num1 : Int, num2 : Int) : Int{
    val suma = num1 + num2
    return suma
    }
fun sinParametro() : Unit {
    println("hola, soy una funcion sin parametros")

}


