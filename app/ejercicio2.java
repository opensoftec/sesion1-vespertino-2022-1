/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio2: Verificar que un numero sea par-impar
package app;

public class ejercicio2 {

    public static void main(String[] args) {
        //Entrada
        int numero=7;
        int residuo=0;
        //Proceso
        residuo=numero%2;      
        //Salida
        if(residuo==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
