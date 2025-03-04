public class Animal implements Volador,Nadador{
    @Override
    public void nadar(){
        System.out.println("El animal  esta nadando");
    }
    @Override
   public void volar(){
    System.out.println("El animal  vuela");
   }
}
