public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    public Persona(String nombre, String apellido,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad=edad;
    }
    public void mostrarDetalles(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido"+apellido);
        System.out.println("Edad:"+edad);
    }

    
}
