/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author Maria liz
 */
public class Empleado {
    protected String nombre;
    protected double salario;
    public Empleado(){
        
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void mostrarInformacion(){
        System.out.println("nombre:"+nombre);
       System.out.println("Salario:"+salario);
        
    }

        
    
}
