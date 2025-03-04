/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

/**
 *
 * @author Maria liz
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto=new Producto("Sal",1234);
        producto.mostrarProducto();
        System.out.println("+++++++++++++++++++++++++");
        Estudiante estudiantes=new Estudiante();
        estudiantes.detallesEstudiantes();
        System.out.println("+++++++++++++++++++++++++");
        Prueba prueba=new Prueba("fifa");
        prueba.Example();
        
        
    }
    
}
