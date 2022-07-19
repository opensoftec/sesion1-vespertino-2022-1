/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio10: Aplicacion que sumule el calculo de rol de pago de un empleado
package app;

public class ejercicio10 {
    public static void main(String[] args) {
        //Entrada
        String empleado = "JOSE DAVILA";
        String cargo = "JEFE DE SISTEMAS";
        double pagoHora = 15.0;
        int numeroHoras = 160;
        double sueldo = 0.0;
        double iess = 0.0;
        double netoRecibir = 0.0;
        //Proceso
        sueldo = pagoHora * numeroHoras;
        iess = sueldo * 0.095;
        netoRecibir = sueldo - iess;
        //Salida
        System.out.println("Empleado: " + empleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Descuento IESS: " + iess);
        System.out.println("El neto a recibir es: " + netoRecibir);
    }
}
