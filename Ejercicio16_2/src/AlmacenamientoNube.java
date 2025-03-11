public class AlmacenamientoNube implements Almacenamiento{
    @Override
    public void guardarArchivo(String  apellido) {
        System.out.println("Archivo  subido a la nube." + apellido);
    }

    @Override
    public String recuperarArchivo(String apellido) {
        return "Recuperando el archivo  desde la nube." + apellido;
    }

}
