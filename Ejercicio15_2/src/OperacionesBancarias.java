public class OperacionesBancarias implements Transferencia,Retiro {
    @Override
    public void Transferir(double valor){
   System.out.println("La transferencia fue realizada con exito :"+valor);
    }
    @Override
    public void retirar(double valor){
   System.out.println("El retiro fue realizado con exito :"+valor);
    }   
}
