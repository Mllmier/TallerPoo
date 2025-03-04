public class Pez implements Nadador,Respirador {
    @Override
    public void respirar(){
        System.out.println("El pez esta respirando ");
    }
    @Override
    public void nadar(){
        System.out.println("El pez esta nadando");
    }
}
