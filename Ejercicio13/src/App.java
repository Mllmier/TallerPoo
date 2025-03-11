public class App {
    public static void main(String[] args) throws Exception {
     Descuento fijo=new DescuentoFijo(120);
     double precion=990;
     System.out.println("El precio final con descuento es:"+fijo.descuento(precion));
     Descuento porcentaje=new DescuentoPorcentaje(45);
     System.out.println("El precio fijo del descuento es:"+fijo.descuento(precion));


    }
}
