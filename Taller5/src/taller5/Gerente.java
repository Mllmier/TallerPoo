/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author Maria liz
 */
public class Gerente extends Empleado {
    private String departamento;
    public Gerente(){
        
    }

    public Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
          System.out.println("Departamento:"+departamento);
        
    }

   

    
    
    
    
}
