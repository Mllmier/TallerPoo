import java.io.PipedReader;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
        Persona empleado=new Empleado("roque",64,"Vigilancia");
        empleado.mostrarDetalles();
        System.out.println("******************************");
        Animal pez=new Pez("Tetraodontidae", "Agua dulce ");
        pez.mostrarDetalles();
        System.out.println("******************************");
    /*Super.especie;not statement*/
    }
}
