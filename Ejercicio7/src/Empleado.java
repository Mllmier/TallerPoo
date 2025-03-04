public abstract class  Empleado  {
    protected double diasTrabajados;
  public abstract double calcularSalario();
  public String obtenerDescripcion() {
    return "diasTrabajados: " + diasTrabajados;
}
  
  public Empleado(double diasTrabajados) {
    this.diasTrabajados = diasTrabajados;
}

public void mostrarSalario(){
    
  }
    

    
}
