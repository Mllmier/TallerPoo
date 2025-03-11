public class App {
    public static void main(String[] args) throws Exception {
      
        Transferencia transferir=new OperacionesBancarias();
        transferir.Transferir(30000);
        Retiro retiro=new OperacionesBancarias();
        retiro.retirar(20000);
        PagoFactura pago=new Pago();
        pago.pagoFactura(60000);

    }
}
