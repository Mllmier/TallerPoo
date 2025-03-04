public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(int numeroPuertas,String marca,double velocidadMaxima){
     super(marca, velocidadMaxima);
     this.numeroPuertas=numeroPuertas;
    }
    @Override 
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de Puertas:"+numeroPuertas);
    }
   /*  public void mostrarDetalles(){
        System.out.println(marca);
    }marca tiene acceso privado */

}
