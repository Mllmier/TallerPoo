public class AutenticacionLocal implements  ServicioAutenticacion  {
    @Override
    public boolean autenticar (String usuario, String contraseña){
        return "mood".equals(usuario) && "0978".equals(contraseña);
    }
}
