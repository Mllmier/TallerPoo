public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando reporte PDF con contenido: " + contenido);
    }
}
