public class mascota {
    //Atributos
    String nombre;
    int edad;
    //Constructor
    public mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //getNombre
    public String getNombre() {
        return nombre;
    }
    //setNombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getEdad
    public int getEdad() {
        return edad;
    }
    //setEdad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Método comer
    public void comer() {
        System.out.println("La mascota come");
    }
    //Método dormir
    public void dormir() {
        System.out.println("La mascota duerme");
    }

}