abstract  class CuentaBancaria  {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);

    public double getSaldo() {
        return saldo;
    }
}
