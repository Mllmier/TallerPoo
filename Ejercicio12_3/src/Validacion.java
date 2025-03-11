public class Validacion {
    public boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.length() >= 6;
    }

    public boolean validarNombreUsuario(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}
