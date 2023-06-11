public class mainSobreCarga {
    public static void main(String[] args) {
        //instancio sobreCargaOpera
        sobreCargaOpera ejemplo = new sobreCargaOpera();
        //Almaceno resultado en variable e imprimo
        int resultado1 = ejemplo.suma(2, 3);
        System.out.println("El resultado de la suma es: " + resultado1);

        float resultado2 = ejemplo.suma(3.4f, 2.3f);
        System.out.println("El resultado de la suma es: " + resultado2);

        int resultado3 = ejemplo.suma(12,3,4,5,6,7);
         System.out.println("El resultado de la suma es: " + resultado3);
    }

}
