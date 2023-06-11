# TEORÍA JAVA

Teoría básica de repaso del lenguaje, la mayoría con código ejemplo. 
https://linktr.ee/jucaicedoa
## Tipos de datos Java

### Enteros:
Estos tipos de datos nos permiten trabajar con números enteros ya sean positivos o negativos: Byte, short, int, long.
### Decimales:
Estos tipos de datos nos permiten trabajar con números los cuales posean punto decimal ya sean positivos o negativos: float, double.
### Caracteres:
Este tipo de datos nos permitirá trabajar con caracteres:char.
### Booleanos:
Este tipo de datos nos permitirá trabajar con valores lógicos, verdadero o falso: boolean.

## CÓDIGO ASCII:

https://elcodigoascii.com.ar

## Palabras Reservadas Java

|1|2|3|4|5|
|--|--|--|--|--|
abstract | continue | for        |  new      | switch       |
assert   | default  |(goto)      | package   | synchronized |
boolean  |  do      | if         | private   | this         |
break    | double   | implements | protected | throw        |
byte     | else     | import     | public    | thows        |
case     | enum     | instanceof | return    | transient    |
catch    | extends  | int        | short     | try          |
char     | final    | interface  | static    | void         |
class    | finally  | long       | strictfp  | volatile     |
(const)  | float    | native     | super     | while        |
true     | false    | null       |           |              |
## Métodos print y println

1. Con el método println el mensaje se imprimirá en consola con un salto de línea.
1. con el método print imprimirá el mensaje en la misma línea.

## Secuencias de escape

Las secuencias de escape en Java nos permiten dar formato a las cadenas de texto con las que nos encontramos trabajando.

* Salto de línea: (**\n**)
* Tabulador: (**\t**)
* Diagonal inversa:(**\\**)
* Comillas dobles: (**\\"**)
* Comillas simples: (**\\'**)

## Operadores
https://twitter.com/coda_col/status/1553868596392198144/photo/1

## Casting

Ejemplo en **casting.java**

## Operador ternario

Ejemplo en **operatorT.java**

## String

No es un tipo primitivo, es un clase. Utilizan ("").

Ejemplo en **string.java**

### Métodos aplicados a String

Ejemplos en **metodosStri.java**

## Condicionales

Ejemplos en **condicionales.java**
Es permitido anidar condicionales.

## Ciclos 

Ejemplos en **ciclos.java**
Es permitido anidar ciclos.

## Arreglos

Longitud es inmutable y manejan datos del mismo tipo que están etiquetados con un índice propio en el arreglo. En Java inician en el índice 0.

Ejemplos en **arreglos.java**

## Métodos sobre cadenas 

Ejemplos en **metodosCadenas.java**

## POO 

### Clases y objetos 

**Clase**

Molde que llega a ser lo más abstracto posible.

**Objeto**

Tipo de dato que surge de la clase (instancia).

**Atributos**

Características propias e identificables.

**this**

Acceder a los atributos.

**Constructor**

Se ejecuta siempre que se instancia un objeto.

**Métodos**

Acciones del objeto.

**Getter**

Retorna el valor de un atributo.
**Setters**

Establece un valor a un atributo.

**Modificadores de acceso métodos y atributos**

default(acceso del mismo paquete), public(acceso desde cualquier paquete), private(solo se tendrá acceso desde la misma clase), protected. 

Dichos modificadores se situan antes de definir el tipo de la variable o método.

Ejemplos en **gato.java** y **mainGato.java** 

**Sobre carga de métodos y constructores**

Se pueden utilizar diferentes métodos o constructores con el mismo nombre pero con diferente tipo o cantidad de parámetros para así obtener diferentes comportamientos, siendo esto la sobrecarga de métodos o constructores.

Ejemplos en **sobreCargaOpera.java** y **mainSobreCarga.java** (Se utiliza de forma similar para constructores).

**static**

Se le asigna a una variable la cual se puede acceder sin instanciar el objeto al que pertenece. Al utilizarlo es importante utilizar nombredeClase.nombreVariable (se convierte en una variable de clase mientras que las demás serán variables de instancia).

**final**

Se le asigna a una variable cuyo valor no cambia.

**clases anidadas**

Una clase que está en otra clase.

Ejemplos en **usuario.java** y **mainClasesAnidadas.java**

**super**

Nos permite utilizar métodos de una clase padre.

**Herencia**

Algunas clases pueden poseer casi la misma cantidad de código por lo que la mejor manera de no tener código duplicado es generalizarlo y heredar clases. Tenemos clase padre y clases hijas; las clases se vuelven más abtrasctas cada vez que ascendamos y más complejas cada vez que descendamos.

Ejemplos en **mascota.java**, **perro.java**, **conejo.java** y **mainHerencia.java**

**Polimorfismo**

Podemos ver al polimorfismo como la sobreescritura de métodos y es que algunos métodos heredados puede que no tengan los mismos comportamientos para todas las clases por lo que es posible modificar ese método de acuerdo a las necesidades particulaes de cada clase. Recomendado utilizar @Override encima de cada método sobreescrito.

**Clases abstractas**

No se puede instanciar, posee al menos un método abstracto. La clase define lo que es y qué hace pero no lo detalla ni dice cómo, eso lo harán las clases hijas que deben implementar todos sus métodos abstractos y sobreescribirlos. Palabra reservada = abstract.

**Principio de sustitución**

Una clase hija puede ser tratada como una clase padre. Se puede necesitar un arreglo que contenga diferentes objetos; dado que hacer un arreglo para cada objeto es poco recomendado se podría utilizar el principio de sustitución (si todos los objetos son hijos del mismo padre) reemplazando solo en la parte izquierda de la declaración e instanciación del objeto el tipo del objeto actual por el de su padre sin dejar de instanciar al objeto actual en la derecha. 

**Interfaces**
