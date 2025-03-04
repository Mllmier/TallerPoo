


public class Empleado {
    private String nombre;
    private double salario;
    public Empleado(String nombre,double salario){
        this.nombre=nombre;
        this.salario=salario;

    }
    public void mostrarDetalles(){
        System.out.println("El nombre del empleado es:"+nombre );
        System.out.println("El salario del empleado es:"+salario);
    }
}

