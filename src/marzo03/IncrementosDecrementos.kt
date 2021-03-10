package marzo03

fun main() {
    var num1 = 10
    var num2 = 5
    val resultado : Int = ++num1 + num2
     // hace el incremento antes de hacer la operacion
    println("num1 se incremeto en 1 es: $num1, y el resulado es $resultado")
     num1 = 10
    val resultado2 : Int = num1++ + num2
    // hace el incremento desspes de hacer la operacion
    println("num1 se incremeto en 1 es: $num1, y el resulado es $resultado2")

}

