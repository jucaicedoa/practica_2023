public class usuario {
    public String nombreUsuario;

    public usuario(String nombreUsuario) {

        this.nombreUsuario = nombreUsuario;
    }

    public void rol() {
        admi admin = new admi();
        admin.trabajar();

    }

    public class admi {
        public void trabajar() {
            System.out.println("El administrador "+nombreUsuario +" se encuentra trabajando");
        }

    }

}
