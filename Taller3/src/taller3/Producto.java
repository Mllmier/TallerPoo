/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author Maria liz
 */
public class Producto {
    String nombre;
    int precio;
    int stock; 

   
    public Producto() {
    }

    
    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

 
    public void mostrarInfo() {
        System.out.println("Nombre:"+nombre+"\nPrecio:"+precio+"\nStock:"+stock);
    }
}


  
