public class condicionales {
    public static void main(String[] args) {
        String ejemplo = "Suspendido";
        if(ejemplo.equals("Encendido")){
            System.out.println("El equipo está encendido, puede correr cualquier programa");
        }else if(ejemplo.equals("Suspendido")){

            System.out.println("Reanudar actividad de equipo");
        }
        //Último caso 
        else{
            System.out.println("Encender el equipo para utilizarlo");
        }
    }
}
