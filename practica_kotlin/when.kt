fun main() {
    when1(3)
    print(when2(3))
    when3(2)
}

fun when1(valor: Any) {
    when (valor) {
        is Int -> println((valor + valor))
        is String -> println(valor)
        is Boolean -> if (valor) println("Es verdadero")
    }
}

fun when2(mes: Int): String {

    return when (mes) {
        in 1..6 -> "El mes $mes hace parte del Primer semestre del año \n"
        in 6..12 -> "El mes $mes hace parte del Segundo semestre del año \n"
        else -> "No conozco el mes $mes \n"
    }
}

fun when3(mes: Int){

    when(mes){
        1,3,5,7,8,10,12 -> println("El mes $mes tiene 31 días")
        2 -> print("El mes $mes tiene 29 días")
        4,6,9,11 -> println("El mes $mes tiene 30 días")
        else -> println("El número $mes no es un mes")
    }

}
