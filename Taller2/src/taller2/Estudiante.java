/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author Maria liz
 */
public class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante(){
        this("Mar",16);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }public void detallesEstudiantes(){
            System.out.println("Nombre:"+nombre+"\nedad:"+edad);
    }
   
    
}
