public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta = new CuentaAhorros(40000, 7.79);

        cuenta.depositar(50000);
        cuenta.retirar(8000);

        System.out.println("Saldo : " + cuenta.getSaldo());    }
}
