/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio11: Aplicacion para la generacion de una venta de productos por consola
package app;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        //Entrada
        Scanner entrada = new Scanner(System.in);
        String producto= "";
        int cantidad =0;
        double precio = 0.0;
        double subtotal=0.0;
        double iva = 0.0;
        double total = 0.0;
        //Proceso
        System.out.print("Producto: ");
        producto = entrada.next();
        System.out.print("Cantidad: ");
        cantidad = entrada.nextInt();
        System.out.print("Precio: ");
        precio = entrada.nextDouble();
        subtotal= cantidad * precio;
        iva = subtotal * 0.12;
        total = subtotal + iva;
        //Salida
        System.out.println("Producto: " + producto);
        System.out.println("subtotal: " + subtotal);
        System.out.println("iva: " + iva);
        System.out.println("Total: " + total);
    }
}
