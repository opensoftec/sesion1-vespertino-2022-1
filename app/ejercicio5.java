/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio5: Aplicacion que permita validar el listado de invitados de una fiesta
package app;
public class ejercicio5 {
    public static void main(String[] args) {
        //Entrada
        String nombre1="LUIS";
        int edad=30;
        //Proceso
        if(edad>=18 && edad<=30){       
        //Salida
            System.out.print(nombre1 + " tiene acceso a la fiesta" );
        }else{
            System.out.print(nombre1 + " no tiene acceso a la fiesta" );
        }
    }    
}
