package marzo11

fun main() {
    print("inserte el num1")
    val n1 = readLine()!!.toInt()
    print("inserte el num2")
    val n2 = readLine()!!.toInt()
    print("inserte el num3")
    val n3 = readLine()!!.toInt()

    val resultado = valorMayor(n1,n2,n3)

    println("El resultado es $resultado")
}

fun valorMayor(num1 : Int, num2 : Int, num3 : Int) : Int{
    if (num1 > num2 && num1 > num2){
        return num1
    }else if (num2 > num3){
        return num2
    }else { return num3}
}

