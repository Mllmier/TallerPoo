public class Pago implements PagoFactura {
    @Override
    public void pagoFactura(double valor ){
        System.out.println("El pago de la factura fue realizado:"+valor);
    }
}
