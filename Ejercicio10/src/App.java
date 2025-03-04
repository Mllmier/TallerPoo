public class App {
    public static void main(String[] args) throws Exception {
     Figura triangulo=new Triangulo(30.5,40.5 );
     triangulo.mostrarArea();
     Figura rectangulo=new Rectangulo(30.8, 35.9);
     rectangulo.calcularArea();
     System.out.println("*********************");
     Pato nadar=new Pato();
     nadar.nadar();
     Pato volar=new Pato();
     volar.volar();
    }
}
