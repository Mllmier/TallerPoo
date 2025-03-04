
public class App {
    public static void main(String[] args) throws Exception {
     Figura circulo=new Circulo(2.5);
     circulo.mostrarArea();

    Figura rectangulo=new Rectangulo(3.5,2.5);
    rectangulo.mostrarArea();
    System.out.println("#############################");
    Empleado gerente=new Gerente(40,20);
     gerente.mostrarSalario();
    Empleado vendedor=new Vendedor(20,30);
   vendedor.mostrarSalario();
  /*  System.out.println("#############################");
   Figura figura=new Figura();Figura is abstract; cannot be instantiated*/
   }
}
