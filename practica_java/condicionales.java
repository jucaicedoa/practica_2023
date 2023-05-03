public class condicionales {
    public static void main(String[] args) {
        String ejemplo = "Suspendido";

        if (ejemplo.equals("Encendido")) {
            System.out.println("El equipo está encendido, puede correr cualquier programa");
        } else if (ejemplo.equals("Suspendido")) {

            System.out.println("Reanudar actividad de equipo");
        }
        // Último caso
        else {
            System.out.println("Encender el equipo para utilizarlo");
        }
        // switch
        switch (ejemplo) {
            case "Encendido":
                System.out.println("El equipo está encendido, puede correr cualquier programa");
                break;
            case "Suspendido":
                System.out.println("Reanudar actividad de equipo");
                break;
            case "Apagado":
                System.out.println("Encender el equipo para utilizarlo");
                break;
            default:
                System.out.println("Caso no válido");
        }
        // Solo se rompe el caso hasta en contrar un break.
        int mes = 3;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Mes tiene 31 días");
                break;
            case 2:
                System.out.println("En años normales este mes tiene 28 días, en año bisiesto 29 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Mes tiene 30 días");
                break;
            default:
                System.out.println("Mes no existe en calendario");
                break;
        }

    }

}
