public class Vendedor extends Empleado{
    protected double ventasRealizadas;

   
    public Vendedor(double diasTrabajados, double ventasRealizadas) {
        super(diasTrabajados);
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public double  calcularSalario() {
        return diasTrabajados*ventasRealizadas;
    }

    @Override
    public void mostrarSalario() {
        System.out.println("El salario del Vendedor es:"+calcularSalario());
    }

    
}
