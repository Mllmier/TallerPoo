public class App {
    public static void main(String[] args) throws Exception {
    Empleado gerente=new Gerente("juan",30000,"salud");
    gerente.mostrarDetalles();
    System.out.println("################################");
    Vehiculo coche=new Coche(4,"Toyota",202);
    coche.mostrarDetalles();
    System.out.println("##################################");
    Persona estudiante=new Estudiante("pedro","Arriaga",18,"matematicas");
    estudiante.mostrarDetalles();
    System.out.println("##################################");
    
    }
}
