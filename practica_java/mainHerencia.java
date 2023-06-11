public class mainHerencia {
    public static void main(String[] args) {
        //Instanciando perro y conejo
        perro perro1 = new perro("perro1",2);
        conejo conejo1 = new conejo("conejo1", 3);
        //Accediento a métodos heredados 
        perro1.comer();
        conejo1.dormir();
    }
}
