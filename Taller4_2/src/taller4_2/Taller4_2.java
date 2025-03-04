/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4_2;

/**
 *
 * @author Maria liz
 */
public class Taller4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Empleado empleado=new Empleado();
    empleado.setNombre("Jorge");
    empleado.setSalario(23456);
    System.out.println("Nombre:"+empleado.getNombre()+"\nSalario:"+empleado.getSalario());
        System.out.println("***********************************");
        CuentaBancaria cuentabancaria=new CuentaBancaria();
        cuentabancaria.setNumeroCuenta("34567890");
        cuentabancaria.setSaldo(18000);
        cuentabancaria.setTipoCuenta("ahorro");
        System.out.println(cuentabancaria);
    System.out.println("***********************************");
     int numero1=10;
     int numero2=2;
     System.out.println("suma:"+Utilidades.Suma(numero1,numero2));
    System.out.println("Resta:"+Utilidades.Resta(numero1,numero2));
    System.out.println("Multiplicacion:"+Utilidades.Multiplicacion(numero1,numero2));
    System.out.println("Division:"+Utilidades.Division(numero1,numero2));
    }
    
}
