/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud1_1;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 4
        double a = 8.2, b = 23.74, c = 3; //Declaramos los terminos independientes
        double x, x2, xs, x2s; // Declaramos la variable donde vamos a guardar el resultado

        xs = -b + Math.sqrt(b * b - 4 * a * c) / 2 * a; //Calculamos x sin aplicar parentesis
        x2s = -b - Math.sqrt(b * b - 4 * a * c) / 2 * a; //Calculamos x2 sin aplicar parentesis

        x = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a); //Calculamos x aplicando parentesis

        x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a); //Calculamos x2 aplicando parentesis

        // Imprimimos los resultados por pantalla
        System.out.println("El resultado de x sin parentesis es " + xs + " y " + x2s);
        System.out.println("El resultado de x con parentesis es " + x + " y " + x2);
    }

}
