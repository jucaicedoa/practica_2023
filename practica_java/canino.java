public interface canino {
    // Método abstracto
    public abstract void aullar();

    // Método default
    public default void dormir() {

        System.out.println("El perro está durmiendo");

    }
}
