/**
 * arreglos
 */
public class arreglos {

    public static void main(String[] args) {
        // Arreglo
        String letras[] = new String[3];
        int notas[] = { 10, 3, 5, 9, 8, 10, 7 };
        // String vocales[] = { "a","e","i","o","u"};
        letras[0] = "a";
        letras[1] = "b";
        letras[2] = "c";
        System.out.println(letras[0]);
        System.out.println(letras[1]);
        System.out.println(letras[2]);
        /*
         * System.out.println(vocales[0]);
         * System.out.println(vocales[1]);
         * System.out.println(vocales[2]);
         * System.out.println(vocales[3]);
         * System.out.println(vocales[4]);
         */

        // Recorrer arreglos (ejemplo promedio del arreglo notas)
        // promedio=sumTodosElementos/totalElementos
        int sum = 0;
        for (int i = 0; i < notas.length; i++) {
            sum = sum + notas[i];
        }
        System.out.println(sum);
        float promedio = sum / notas.length;
        System.out.println("El promedio del arreglo notas es: " + promedio);

        // MATRICES
        int matri[][] = new int[2][2];

        matri[0][0] = 1;
        matri[0][1] = 2;
        matri[1][0] = 3;
        matri[1][1] = 4;
        // matri.length me retorna la cantidad de filas de la matriz
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) { // matri.[i]length se utiliza porque una matriz es un arreglo de
                                                        // arreglos, así que esto me retorna el tamaño del arreglo
                                                        // ubicado en la posición i
                System.out.println(matri[i][j]);
            }
        }

    }
}
