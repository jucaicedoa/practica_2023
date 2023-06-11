fun main(){
    //Valores
    //Int
    val age:Int = 30
    //Float
    val float1:Float=30.3f
    //Double
    val double1:Double=2323.232
    //Char
    val char1:Char = 'w';
    //String
    val string1 = "jucaicedoa"
    //Boolean
    val boolean1:Boolean = true
   
    println(age)
    println(float1)
    println(double1)
    println(char1)
    println(string1)
    println(boolean1)
   
    //Variables
    var age1:Int = 30
    println("valor sin modificar " + age1)
    age1 = 23
    println("valor modificado "+ age1)
   
    var suma1:Int = age1 + float1.toInt()
    println(suma1)
   
    var strinmodificar:String = "Hola"
    strinmodificar = "Hola me llamo $string1"
    println(strinmodificar)
   
   }
   