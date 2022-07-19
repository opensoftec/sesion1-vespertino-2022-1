/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio3: Aplicacion que permita verificar si un numero es multiplo 7
package app;

public class ejercicio3 {

    public static void main(String[] args) {
        //Entrada
        int numero=8;
        int residuo=0;
        //Proceso
        residuo=numero%7;
        //Salida
        if (residuo == 0) {
            //Salida
            System.out.println("Si es multiplo de 7");
        } else {
            System.out.println("No es multiplo de 7");
        }
    }

}
