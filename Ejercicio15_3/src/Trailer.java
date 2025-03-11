public class Trailer implements Conducir,CargarMercancias{

    @Override
    public void conducir() {
        System.out.println("El Trailer esta en movimiento");

    }

    @Override
    public void carga() {
        System.out.println("El Trailer tiene carga de mercancia");
        
    }
    
}