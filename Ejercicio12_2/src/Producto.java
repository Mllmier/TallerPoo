public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
  public Producto(){
    
  }
    public Producto(int cantidad, String nombre, double precio) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "GerenerarEtiquetas [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }
}
