public class Autenticacion {
    public boolean autenticar(Usuario usuario,String contraseñaIngre){
        return usuario.getContrasena().equals(contraseñaIngre);
    }
}
