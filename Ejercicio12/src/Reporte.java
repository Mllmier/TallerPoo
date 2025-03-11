public class Reporte {
    public static String generarReporte(Libro libro) {
        return "Reporte:\nTitulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nAño: " + libro.getAño();
    }
}

