public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("admin", "123456");
        
        System.out.println("********************************");
        Validacion validacionService = new Validacion();
        if (validacionService.validarNombreUsuario(usuario.getNombre())) {
            System.out.println("Nombre de usuario válido.");
        } else {
            System.out.println("Nombre de usuario inválido.");
        }

        if (validacionService.validarContrasena(usuario.getContrasena())) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
        }

        Autenticacion autenticacionService = new Autenticacion();
        if (autenticacionService.autenticar(usuario, "123456")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida.");
        }    }
}
