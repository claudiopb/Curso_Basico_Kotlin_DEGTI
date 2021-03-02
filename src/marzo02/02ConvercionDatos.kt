package marzo02

fun main() {
    var num1 = 5
    var num2 = 30
    var strgnumero = "19"
    println(num1)
    //casting
    num1 = strgnumero.toInt()
    println(num1)

    // undefine

    var num3 : Float?
    num3 = num1.toFloat()
    println(num3)

    var num4:Double?
    num4 = num3.toDouble()
    println("Floar a Doublenum4")
    strgnumero = num4.toString()
    println("Casting de Double a String $strgnumero")



}

