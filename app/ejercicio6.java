/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio6: Aplicacion que valide el servicio de parquimetro de vehiculos
package app;

public class ejercicio6 {

    public static void main(String[] args) {
        //Entrada
        String vehiculo = "TRAILER";
        //Proceso
        if (vehiculo.equals("AUTO") || vehiculo.equals("SUV") || vehiculo.equals("CAMION")) {
            //Salida
            System.out.print("Tiene acceso al parquimetro");
        } else {
            System.out.print("NO tiene acceso al parquimetro");
        }
    }
}
