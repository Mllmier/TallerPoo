public class App {
    public static void main(String[] args) throws Exception {
     Conducir conduce=new Moto();
     conduce.conducir();
     Conducir trailer=new Trailer();
     trailer.conducir();
     CargarMercancias carga=new Trailer();
     carga.carga();


    }
}
