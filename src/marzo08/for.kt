package marzo08

fun main() {
    for(elemento in 1..5){
        println("El valor actual es $elemento")

        if(elemento == 3){
            println("Elemento encontrado")
        }
    }

    for (contador1 in 1..5){
        println("Contador 1 es $contador1")
        for (contador2 in 1..3){
            println("Contador 2 es $contador2")
        }
        println("For anidado concluido")
    }
    println("El ciclo for a terminador")


}

