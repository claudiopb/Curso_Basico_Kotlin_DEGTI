package ejercicios

fun main() {

    print("Ingresa la cantidad total de preguntas: ")
    val totalPreguntas = readLine()!!.toInt()
    println("")
    print("Ingresa la cantidad de preguntas que contesto correctamente: ")
    val correctas = readLine()!!.toInt()
    println("")

    val prom = (correctas *100) / totalPreguntas
     println(prom)
    if(prom >= 90){
        println("Nivel Maximo")
    }else if(prom in 75..90) {
        println("Nivel Medio")
    }else if(prom in 50..75) {
        println("Nivel Regula")
    }else println("Fuera de Nivel")
}

