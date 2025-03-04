/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author Maria liz
 */
public class Prueba {
    public static void main(String[]args){
    Producto pruebaproducto=new Producto("Telefono",45668,23);
    pruebaproducto.mostrarInfo();
    
    Persona persona=new Persona();
   persona.setNombre("Camilo");
  /* persona.edad(12);
   cannot find symbol
  symbol:   method edad(int)
  location: variable persona of type Persona*/
   persona.setEdad(130);
        System.out.println(persona);
   
    
    }
    
}
