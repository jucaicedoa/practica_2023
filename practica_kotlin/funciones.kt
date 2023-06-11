fun main() {


    val numero: Int = 30
    val numero1: Int = 20
    hola()
    hola("mucho gusto")
    suma(23,31)
    edad()
    var resul= resta(2,1)
    println(resul)
}

//Función normal sin parámetros
fun hola() {
    println("Hola desde una función")
}

//Función con parámetros de entrada
fun hola(mensaje: String) {

    println("Hola $mensaje")
}

fun suma(nume:Int, nume1: Int){
    println(nume+nume1)
}

//Función con valor por defecto
fun edad(nume:Int = 20){
    println("Tengo $nume años")
}

//Función con retorno
fun resta(nume:Int, nume1: Int):Int{
    return (nume-nume1)
}

fun resta1(nume:Int, nume1: Int):Int=nume-nume1
