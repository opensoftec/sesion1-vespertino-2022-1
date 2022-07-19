/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio4: Aplicacion que valide que dos numeros son pares
package app;

public class ejercicio4 {

    public static void main(String[] args) {
        //Entrada
        int numero1 = 7;
        int numero2 = 9;
        int residuo1 = 0;
        int residuo2 = 0;
        //Proceso
        residuo1 = numero1 % 2;
        residuo2 = numero2 % 2;
        //Salida
        if (residuo1 == 0 && residuo2 == 0) {
            System.out.println("Los dos numeros son pares");
        } else {
            System.out.println("Los dos numeros NO son pares");
        }
    }

}
