public class App {
    public static void main(String[] args) throws Exception {
        GestorAutenticacion gestor1 = new GestorAutenticacion(new AutenticacionLocal());
        gestor1.iniciarSesion("mood", "0978");

        GestorAutenticacion gestor2 = new GestorAutenticacion(new AutenticacionOAuth());
        gestor2.iniciarSesion("tood@oauth.com", "intenso");
    }
}
