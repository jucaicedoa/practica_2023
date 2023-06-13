fun main() {
    arrays()
    listas()
}

fun arrays(){
    //Arrays son inmutables

    val diasSemana =
        arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(diasSemana.size)
    println(diasSemana[0])

    diasSemana[0] = "lunes"
    println(diasSemana[0])

    for (position in diasSemana.indices) {
        println(diasSemana[position])
    }

    for ((position, value) in diasSemana.withIndex()) {
        println("La posición $position, contiene $value")
    }
    for (diaSemana in diasSemana) {
        println("Ahora es: $diaSemana")
    }
}

fun listas(){
    //Listas inmutables
    val nombre:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(nombre.size)
    println(nombre)
    println(nombre[0])
    println(nombre.last())
    println(nombre.first())

    val  ejemplo = nombre.filter { it.contains("a") }
    println(ejemplo)

    nombre.forEach{diaSemana -> println(diaSemana) }

    //Listas mutables
    val diasSemana:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    diasSemana.add(0,"jucaicedoa")
    println(diasSemana)

    if(diasSemana.isNotEmpty()){
        diasSemana.forEach{ println(it) }
    }
    println(diasSemana.last())
    println(diasSemana.size)
}