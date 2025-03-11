public class App {
    public static void main(String[] args) throws Exception {
        GestorReportes reporteinicial = new GestorReportes(new ReportePDF());
        reporteinicial.crearReporte("creacion de factura ");

        GestorReportes reporte2 = new GestorReportes(new ReporteExcel());
        reporte2.crearReporte("Autenticacion de Informacion ");
    }    
}
