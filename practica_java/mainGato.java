public class mainGato {
    public static void main(String[] args) {
        gato Venus = new gato("Venus", 2, "Blanca con manchitas");
        System.out.println("El nombre del gato es: " + Venus.getNombre());
        Venus.lamiendo();
        Venus.comiendo();
        Venus.dormir();
        String nombres = Venus.agregado();
        System.out.println(nombres);
    }

}
