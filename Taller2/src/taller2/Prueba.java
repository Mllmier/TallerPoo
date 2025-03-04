/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author Maria liz
 */
public class Prueba {
    String prueba;
    public Prueba(){
        
    }
    

    public Prueba(String prueba) {
        this.prueba = prueba;
    }
    
     void  Example(){
        System.out.println("Prueba:"+prueba);
     /*   System.out.println("Prueba:"+this.prueba);
 non-static variable this cannot be referenced from a static context*/
    }
    
}
