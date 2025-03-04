/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6;

/**
 *
 * @author Maria liz
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Coche coche=new Coche("Honda","civic");
        System.out.println(coche);
      coche.mostrarContador();
      System.out.println("********************************");
       int resultadoSuma=Matematica.Suma(3, 2);
       int resultadoResta=Matematica.Resta(5, 2);
       int resultadoMultiplicacion=Matematica.Multiplicacion(9, 4);
       int resultadoDivision=Matematica.Division(10, 2);
       System.out.println("Suma:"+resultadoSuma);
       System.out.println("Resta:"+resultadoResta);
       System.out.println("Multiplicacion:"+resultadoMultiplicacion);
       System.out.println("Division:"+resultadoDivision);
       System.out.println("********************************");
       Persona persona=new Persona("maria",18);
        System.out.println(persona);    }
    
}
