public class App {
    public static void main(String[] args) throws Exception {
    Persona hablar=new Persona();
    hablar.hablar();
    Persona trabajar=new Persona();
    trabajar.trabajador();
    System.out.println("***************************");
    Pez nadar=new Pez();
    nadar.nadar();
    Pez respirar=new Pez();
    respirar.respirar();
    System.out.println("***************************");
    Animal nada=new Animal();
    nada.nadar();
    Animal volar=new Animal();
    volar.volar();
    }
}
