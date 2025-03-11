public class App {
    public static void main(String[] args) throws Exception {
        Libro libro = new Libro("Gabriel García Márquez", 1967, "Cien años de soledad");

        String reporte = Reporte.generarReporte(libro);
        System.out.println(reporte);

        Persistencia persistencia = new Persistencia();
        persistencia.persistencia(libro.getAutor(), libro.getAño(), libro.getTitulo());
        
       

    }
}
