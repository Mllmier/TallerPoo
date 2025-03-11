public class DescuentoPorcentaje extends Descuento {
   private double porcentaje;
    public DescuentoPorcentaje(double porcentaje){
        this.porcentaje=porcentaje;

    }
    @Override 
    public double descuento(double precio){
        return precio-(precio*(porcentaje/100));
    }
}
