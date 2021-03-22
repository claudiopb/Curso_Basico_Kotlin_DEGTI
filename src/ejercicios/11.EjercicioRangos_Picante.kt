package ejercicios



fun main() {
    var muySuave = 0
    var suave = 0
    var moderado = 0
    var alto = 0
    var muyAlto = 0
    var op = ""
    do{
        print("Desea ingresar un dato s/n")
        op = readLine().toString()

        if (op != "n"){

            print("Incerte Unidades de Calor Scoville (SHU)")

            when (readLine()!!.toInt()) {
                in 0..699 -> {
                    muySuave++
                }
                in 700..2999 -> {
                    suave++
                }
                in 3000..24999 -> {
                    moderado++
                }
                in 25000..69999 -> {
                    alto++
                }
                else -> {
                    muyAlto++
                }
            }
        }



    }while(op != "n")
    println("Cantidad de datos dentro del nivel muy suave: $muySuave")
    println("Cantidad de datos dentro del nivel suave: $suave")
    println("Cantidad de datos dentro del nivel moderado: $moderado")
    println("Cantidad de datos dentro del nivel altp: $alto")
    println("Cantidad de datos dentro del nivel muy alto: $muyAlto")

}

