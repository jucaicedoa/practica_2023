/**
 * mascota
 */
public class mascota {

    String nombre;
    int edad;

    public mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println("La mascota come");
    }

    public void dormir() {
        System.out.println("La mascota duerme");
    }

}