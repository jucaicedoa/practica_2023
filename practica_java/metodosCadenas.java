public class metodosCadenas {
    public static void main(String[] args) {

        String cadena = "Repositorio jucaicedoa"; // Un String está compuesto por elementos de tipo char los cuales tienen una posición en el String que inicia en 0
        System.out.println(cadena.length()); // Tamaño de la cadena
        // System.out.println(cadena.charAt(2));
        char parte = cadena.charAt(2);
        System.out.println(parte);
        System.out.println(cadena.indexOf("o")); // primera conincidencia desde el comienzo
        System.out.println(cadena.lastIndexOf("e")); // primera conincidencia desde el final
    }
}
