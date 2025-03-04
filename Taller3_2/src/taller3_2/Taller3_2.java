/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3_2;

/**
 *
 * @author Maria liz
 */
public class Taller3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
      
       Vehiculo vehiculo=new Vehiculo();
       Vehiculo bicicleta=new Bicicleta();
        bicicleta.moverse();
      /*  @Override
          public void Derivada(){
              System.err.println("La integral no es");
          }modifier public not allowed here 'void' type not allowed here Variable Derivada is neither read or written to*/
        System.out.println("***************************");
      Derivada derivada=new pruebaDerivada();
      derivada.Derivada(2);
     
    }
    
}
