public class App {
    public static void main(String[] args) throws Exception {
     Documento zic=new DocumentoZic();
     zic.exportar();
     Documento powerpoint=new DocumentoPowerPoint();
     powerpoint.exportar();
     Documento pdf=new ExportacionPdf();
     pdf.exportar();
    }
}
