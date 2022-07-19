/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio14: Aplicacion que permita presentar la cantidad de vocales y consonantes 
//De una palabra
package app;

import javax.swing.JOptionPane;

public class ejercicio14 {

    public static void main(String[] args) {
        //Entrada
        String palabra = "";
        int longitud = 0;
        int contadorVocales = 0;
        int contadorConsonantes =0;
        //Proceso
        palabra = JOptionPane.showInputDialog("Ingrese la palabra");
        //Length obtiene la cantidad de caracteres de una String (palabra)
        longitud = palabra.length();
        for (int indice = 0; indice < longitud; indice++) {
            //Condicion para contar el numero de vocales
            if (palabra.charAt(indice) == 'a' || palabra.charAt(indice) == 'e'
                    || palabra.charAt(indice) == 'i' || palabra.charAt(indice) == 'o'
                    || palabra.charAt(indice) == 'u') {
                contadorVocales++;
            }else{
                contadorConsonantes++;
            }
        }
        //Salida
        JOptionPane.showMessageDialog(null, "La cantidad de vocales es: " + contadorVocales);
        JOptionPane.showMessageDialog(null, "La cantidad de consonantes es: " + contadorConsonantes);
    }
}
