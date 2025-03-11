public class AlmacenamientoLocal implements Almacenamiento{
    @Override
    public void guardarArchivo(String   apellido){
        System.out.println("Archivo   Guardado en disco local"+apellido);
    }

    @Override
    public  String recuperarArchivo(String apellido){
        return "Recuperando archivo  del disco local"+apellido;
    }
}
