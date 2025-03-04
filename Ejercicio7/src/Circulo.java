
public class  Circulo extends Figura  {
   public Circulo(){

   }
  protected  double radio;
    public Circulo(double radio ){
     this.radio=radio;

    }
    @Override 
    public double calcularArea(){
        return 3.1416*(Math.pow(2, radio));
    }

    @Override
    public void mostrarArea() {
      System.out.println("El area del circulo es:"+calcularArea());
    }

    
    
    
}
