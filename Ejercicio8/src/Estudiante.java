public class Estudiante extends Persona{
    private String matricula;

   

    public Estudiante(String nombre, String apellido, int edad, String matricula) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
    }



    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Matricula:"+matricula);
    }
    
    
}
