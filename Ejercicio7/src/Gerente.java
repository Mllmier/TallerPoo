public class Gerente extends Empleado{
protected double horasTrabajadas;



    public Gerente(double diasTrabajados, double horasTrabajadas) {
    super(diasTrabajados);
    this.horasTrabajadas = horasTrabajadas;
}



    @Override
    public double  calcularSalario(){
        return (int)horasTrabajadas*diasTrabajados;
    }

    @Override
    public void mostrarSalario() {
     System.out.println("El salario del gerente es:"+calcularSalario());
    }

 } 

