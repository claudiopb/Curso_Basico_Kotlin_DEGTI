package ejercicios

fun main() {


    print("Ingresa el numero del primer dado: ")
    val dado1 = readLine()!!.toInt()
    println("")
    print("Ingresa el numero del segundo dado: ")
    val dado2 = readLine()!!.toInt()
    println("")
    print("Ingresa el numero del tercer dado: ")
    val dado3 = readLine()!!.toInt()
    println("")

    if (dado1 == 6 && dado2 == 6 && dado3 == 6){
        println("Exelente")
    }else if((dado1 == 6 && dado2 ==6) || (dado1 == 6 && dado3 ==6)|| (dado2 == 6 && dado3 ==6)){
        println("Muy bien")
    }else if((dado1 == 6) || (dado2 == 6)|| (dado3 == 6)){
        println("Regular")
    }else println("Pesimo")
}

