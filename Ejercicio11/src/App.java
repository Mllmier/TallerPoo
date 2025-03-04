public class App {
    public static void main(String[] args) throws Exception {
        Figura rectangulo=new Rectangulo(23.8, 23.4);
    rectangulo.calcularArea();
    Figura circulo=new Circulo(23.9);
    circulo.calcularArea();
    System.out.println("+++++++++++++++++++++++++");
    Vehiculo coche=new Coche();
    coche.mover();
    Vehiculo bicicleta=new Bicicleta();
    bicicleta.mover();
    System.out.println("+++++++++++++++++++++++++");
    Persona estudiante=new Estudiante();
    estudiante.presentarse();
    Persona profesor=new Profesor();
    profesor.presentarse();
    System.out.println("+++++++++++++++++++++++++");
      /*Persona profe=new Profesor();
     profe.asignatura();The method asignatura() is undefined for the type Persona*/
    }
}
