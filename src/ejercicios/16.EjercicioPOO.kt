package ejercicios

class Persona  {

    private var nombre : String? = null
    private var edad : Int? = null

    fun inicializar() {
        print("Ingrese el nombre ")
        nombre = readLine()!!
        print("Ingrese su edad ")
        edad = readLine()!!.toInt()
    }

    fun imprimir() {
        println("Su nombre es $nombre y su edad es $edad")
    }

    fun esMayor() {
        if (edad!! >= 18)
            println("$nombre es mayor de edadd")
        else
            println("$nombre se menor de edad")
    }


}
fun main() {
    val persona1 = Persona()
    val persona2 = Persona()
    persona1.inicializar()
    persona1.imprimir()
    persona1.esMayor()
    persona2.inicializar()
    persona2.imprimir()
    persona2.esMayor()
}

