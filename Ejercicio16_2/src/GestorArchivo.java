public class GestorArchivo {
    private Almacenamiento almacenamiento;

    public GestorArchivo(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void subirArchivo(String apellido) {
        almacenamiento.guardarArchivo(apellido);
    }

    public void descargarArchivo(String apellido) {
        System.out.println(almacenamiento.recuperarArchivo(apellido));
    }
}
