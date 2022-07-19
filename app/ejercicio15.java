/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio15: Aplicacion utilizando switch - case combinando con ciclos repetitivos
//Evaludar dos excenarios donde el escenario 1: Presente los numeros de forma descente hasta llegar
//A 0 a partir de un numero ingresado
//El segundo escenario 2: Presenta los numeros de forma ascendente hasta llegar al numero 10
//Un numero ingresado
package app;

import javax.swing.JOptionPane;

public class ejercicio15 {

    public static void main(String[] args) {
        //Entrada
        int numero = 0;
        int opcion = 0;
        //Proceso
        opcion = Integer.parseInt(JOptionPane.showInputDialog("----MENU DE OPCIONES-----" + "\n"
                + "1.GENERA SECUENCIA ASCENDENTE" + "\n"
                + "2.GENERA SECUENCIA DESCENDENTE"));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));
        //Proceso de validar secuencia
        switch (opcion) {
            case 1:
                //Presento ascendente
                for(int indice = numero + 1; indice < 11; indice++){
                    JOptionPane.showMessageDialog(null, indice);
                }
                break;
            case 2:
                //Presento descendente
                for(int indice = numero - 1; indice >=0; indice--){
                    JOptionPane.showMessageDialog(null, indice);
                }
                break;
        }

    }

}
