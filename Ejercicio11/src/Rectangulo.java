public class Rectangulo extends Figura  {
    private double base;
    private double  altura;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override 
    public void calcularArea(){
        double result=base*altura;
        System.out.println("El area del rectangulo:"+result);
    }
}
