/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4_;

/**
 *
 * @author Maria liz
 */
public class Taller4_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Estudiante estudiante1=new Estudiante("juan",23,5);
      System.out.println("Nombre:"+estudiante1.getNombre()+"\nEdad:"+estudiante1.getEdad()
              +"\nPromedio:"+estudiante1.getPromedio());
      System.out.println("*****************************");
      Coche coche=new Coche("Ferrari","488 Spider",2345);
        System.out.println("Marca:"+coche.getMarca()+"\nModelo:"
                +coche.getModelo()+"\nVelocidad Maxima:"+coche.getVelocidadMaxima());
        System.out.println("****************************");
        /*Coche coche2=new Coche();
        coche2.marca();
        cochee2.modelo();
        cannot find symbol
     symbol:   method Nombre(String)
    location: variable estudiante of type Estudiante*/
        
       /* Prueba prueba = new Prueba("malo");
        System.out.println(prueba.cabello); cabello has private access in Prueba*/
    }
    
}
