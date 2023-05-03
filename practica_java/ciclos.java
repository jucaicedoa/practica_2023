public class ciclos {
    public static void main(String[] args) {
        
        int nume = 0, contador = 0, contado = 0;
        int numero = 938192, numer = 938192;
        
        // while --> Se evalúa y luego se ejecuta el bloque
        while (nume < 10) {
            System.out.println("ciclo while " + nume);
            nume++;
        }

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        
        System.out.println("El numero tiene " + contador + " digitos");

        // do while --> Se ejecuta al menos una vez el bloque y luego se evalúa.
        do {
            numer = numer / 10;
            contado++;
        } while (numer > 0);
        
        System.out.println("El numero tiene " + contado + " digitos");
    
        // for


    
    }
}
