public class App {
    public static void main(String[] args) throws Exception {
        GestorArchivo archivo = new GestorArchivo(new AlmacenamientoLocal());
        archivo.subirArchivo("Formatos.pdf");
        archivo.descargarArchivo("Formatos.pdf");

        GestorArchivo archivo2 = new GestorArchivo(new AlmacenamientoNube());
        archivo2.subirArchivo("imagenes .png");
        archivo2.descargarArchivo("imagenes.png");
    }
}
