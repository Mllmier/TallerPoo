public class App {
    public static void main(String[] args) throws Exception {
        Producto  producto = new Producto(12,"Laptop", 15000);
        GerenerarEtiquetas etiqueta=new GerenerarEtiquetas();
        etiqueta.GerenerarEtiquetas(producto);
 
         CalculoPrecios precios=new CalculoPrecios();
         double preciofinal=precios.CalcularPrecio(producto);
         System.out.println("El precio del producto es "+preciofinal);    }
}
