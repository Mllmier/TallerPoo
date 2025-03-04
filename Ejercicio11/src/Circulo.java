public class Circulo extends Figura {
    private double radio;


  
    public Circulo(double radio) {
        this.radio = radio;
    }



    @Override
    public void calcularArea(){
        double result= Math.PI*Math.pow(2, radio);
        System.out.println("El area del circulo:"+result);
    }

}
