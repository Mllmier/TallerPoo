/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author Maria liz
 */
public class Persona {
    private String nombre;
    private int  edad;
    public Persona(){
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public static void Cambiar(Persona instancia,String nuevoNombre,int nuevaEdad){
        instancia.nombre=nuevoNombre;
        instancia.edad=nuevaEdad;
        
    }

    @Override
    public String toString() {
        return "Persona" + "\nnombre:" + nombre + "\n edad:" + edad  ;
    }
    
    
    
}
