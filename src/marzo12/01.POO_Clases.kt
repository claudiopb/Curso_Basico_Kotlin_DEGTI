package marzo12

class Persona(nombre: String, edad: Int, altura: Double, peso: Double, color_ojos: String, genero: String) {

    var nombre : String? = null
    var edad : Int? = null
    var altura : Double? = null
    var peso : Double? = null
    var color_ojos : String? = null
    var genero : String? = null

    init {
        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.color_ojos = color_ojos
        this.genero = genero
    }

    fun GetNombre():String?{
        return this.nombre
    }


}

fun main() {
    var persona1 =Persona("Abisaí",29,1.85,110.5,
    "negros", "masculino")

    println("El nombre es: ${persona1.GetNombre()}")

}

