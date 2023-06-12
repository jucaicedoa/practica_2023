fun main() {
    utilizarIf("gato")
}

fun utilizarIf(mascota: String) {

    if (mascota == "perro") {
        println("La mascota es un perro")
    } else if (mascota == "gato") {
        println("La mascota es un gato")
    } else {
        println("No tengo esa mascota en mis opciones")
    }
}