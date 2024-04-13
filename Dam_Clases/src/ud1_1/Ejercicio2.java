/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud1_1;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 2
        double radio = 3; // Decralamos el radio
        final double PI = 3.14; // Declaracion del valor de PI tipo constante
        double longitud; // Declaramos la variable para guardar el resultado

        longitud = 2 * PI * radio; // Calculamos el area segun la formula
        // longitud = 2*PI*r

        // Mostramos por pantalla el resultado
        System.out.println("La longitud de la circunferencia es " + longitud + " metros.");
    }

}
