public class DescuentoFijo  extends Descuento{
private double cantidad;
    public DescuentoFijo(double cantidad){
this.cantidad=cantidad;
}
@Override
public double descuento(double precio){
    return Math.max(precio-cantidad,0);
}
}
