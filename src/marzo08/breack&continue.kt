package marzo08

fun main() {
    for (element in 1..5){
        if (element !=3){
            println(element)
        }
    }
    println("---------------------")
    for (element in 1..5){
        if (element ==3){
            continue
        }
        println(element)
    }

    println("---------------------")
    for (element in 1..5){
        if (element ==3){
            break
        }
        println(element)
    }

    println("---------------------")
    for(cont1 in 1..2){
        for(cont2 in 1..5){
            println("Contador 1 es: $cont1")
            if(cont2 == 2){
                break
            }
        }
    }

    println("---------------------")
    loop@for(cont1 in 1..2){
        for(cont2 in 1..5){
            println("Contador 1 es: $cont1")
            if(cont2 == 2){
                break@loop
            }
        }
    }


}



