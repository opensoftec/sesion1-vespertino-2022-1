/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio8: Aplicacion que valide el medio de pago en efectivo y de documentos en la venta 
//De un vehiculo a un cliente
package app;

public class ejercicio8 {

    public static void main(String[] args) {
        //Entrada
        String vehiculo = "FORD-F150";
        boolean licencia = false;
        boolean efectivo = false;
        //Proceso
        if (licencia == true) {
            //if-anidacion
            if (efectivo == true) {
                //Salida
                System.out.println("Se ejecuta la venta del vehiculo: " + vehiculo);
            } else {
                System.out.println("Cumple con la licencia, pero no cumple el efectivo, no se ejecuta la venta ");
            }
        } else {
            System.out.println("No cumple con el requisito principal (LICENCIA)");
        }
    }

}
