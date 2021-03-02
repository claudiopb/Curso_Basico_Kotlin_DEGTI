package marzo02

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    var nombre = "Claudio"
    var edad = 43
    var ciudad = "Cd. victoria"

    println("Mi nombre es: $nombre, \n" +
            "tengo $edad, años " +
            "y \n vivo en $ciudad")
// constantes
    val id = "23ert"
    // id = 45ert no se puede modificar el valor

    var doble = 34.4545456
    var flotabte = 45.452345252345235f
    println(doble)
    println(flotabte)

    //redondeo
    println("%.2f".format(doble))

    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    println(df.format(doble))

    var nombre2 = "Claudio Peña Barragán"
    println("la tercera letra de la variable nombre2 es ${nombre2[2]}")
    println("la tercera letra de la variable nombre2 es ${nombre2}")
}

