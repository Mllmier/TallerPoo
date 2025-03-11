public class CalculoPrecios {
    public double CalcularPrecio(Producto producto){
        double precio=producto.getPrecio();
        return precio+(precio*0.16);
    }
}
