class metodosStri {
    public static void main(String[] args) {
        String mensaje = "Soy un String";
        // Tamaño
        int cantidad = mensaje.length();
        System.out.println(cantidad);
        // buscar palabra en String
        boolean se_encuenta = mensaje.contains("un");
        System.out.println(se_encuenta);
        // concatenar
        // Se puede concatenar con (+) variables y Strings
        String nuevo_mensaje = mensaje.concat(", concateno");
        System.out.println(nuevo_mensaje);
        // Mayúscula (cambio visual y no en variable)
        System.out.println(nuevo_mensaje.toUpperCase());
        // Minúscula (cambio visual y no en variable)
        System.out.println(nuevo_mensaje.toLowerCase());
        // Eliminar espacios iniciales y finales(cambio visual y no en variable)
        String mensaje1 = "  mensaje con espacios  ";
        System.out.println(mensaje1.trim());
        System.out.println(mensaje1.toUpperCase().trim());
        // format (%s, %d, %f)
        String mensa = "";
        String github = "jucaicedoa";
        mensa = String.format("Estás en el github de %s", github);
        System.out.println(mensa);
        // Comparar cadenas
        String cade = "Cadena";
        String cade1 = "Cadena";
        // Con equals tienen que se exactamente iguales en escritura y no solo en
        // contenido
        boolean result = cade.equals(cade1);
        System.out.println(result);
        // Con equalsIgnoreCase nos fijamos si el contenido es el mismo y estandarizamos
        // de cierta forma la escritura para compararlos
        boolean resulta = cade.equalsIgnoreCase(cade1);
        System.out.println(resulta);
    }

}
