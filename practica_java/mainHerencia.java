public class mainHerencia {
    public static void main(String[] args) {
        perro perro1 = new perro("perro1",2);
        conejo conejo1 = new conejo("conejo1", 3);
        perro1.comer();
        conejo1.dormir();
    }
}
