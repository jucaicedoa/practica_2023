public class usuario {
    //Atributo
    public String nombreUsuario;
    //Constructor
    public usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    //Método que define rol
    public void rol() {
        admi admin = new admi();
        admin.trabajar();

    }
    //Clase interna admi
    public class admi {
        public void trabajar() {
            System.out.println("El administrador "+nombreUsuario +" se encuentra trabajando");
        }

    }

}
