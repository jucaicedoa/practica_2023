/**
 * gato
 */
public class gato {
    // Atributos
    private String nombre;
    public int edad;
    String color;

    public gato(String nombre, int edad, String color) { // Constructor siempre tiene el nombre de la clase
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    // Métodos
    void lamiendo() {
        System.out.println("El gato se está lamiendo");
    }

    void comiendo() {
        System.out.println("El gato está comiendo");
    }

    void dormir() {
        System.out.println("El gato se encuentra dormido");
    }

    String agregado() {// Solo es un ejemplo puesto que como modelo el nombre María no me serviría para
                       // generalizar
        String nombreAgregado = this.nombre + " María";
        return nombreAgregado;
    }

    // Getter
    String getNombre() { // Se puede acceder a un atributo privado utilizando el método get
        return this.nombre;
    }

    // Setter
    void setNombre(String nombre) {// Se puede modificar un atributo privado utilizando el método set
        this.nombre = nombre;
    }
}
