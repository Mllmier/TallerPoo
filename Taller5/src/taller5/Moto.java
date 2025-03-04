/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author Maria liz
 */
public class Moto extends Vehiculo{
    private  String cilindrada;

    public Moto(String cilindrada, String tipo, String marca) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void detalles() {
        super.detalles(); 
        System.out.println("Cilindrada:"+cilindrada);
    }
    

  
    
    
    
}
