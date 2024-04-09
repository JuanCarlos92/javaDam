
import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio12AnoBisiesto {

    //Ejercicio 12: Escribe un programa que reciba un año y nos diga si es bisiesto o no.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;
        boolean rectangulo = false;
        
        // Solicitud de datos al usuario
        System.out.println("Este programa muestra la clasificación de un triángulo:");
        System.out.print("Introduce el valor del lado A: ");
        ladoA = sc.nextInt();
        System.out.print("Introduce el valor del lado B: ");
        ladoB = sc.nextInt();
        System.out.print("Introduce el valor del lado C: ");
        ladoC = sc.nextInt();

        // Realizamos Cálculos y mostramos en pantalla
        // Para calcular el Teorema de Pitágoras debemos hallar en primer lugar la hipotenusa.
        // Una vez sabemos cual es el lado más largo, comprobamos Pitágoras, si se cumple
        // el valor de rectángulo pasa a true.
        if (ladoA > ladoB && ladoA > ladoC) {
            if ((Math.pow(ladoA, 2)) == (Math.pow(ladoB, 2)) + (Math.pow(ladoC, 2))) {
                rectangulo = true;
            }
        } else if (ladoB > ladoA && ladoB > ladoC) {
            if ((Math.pow(ladoB, 2)) == (Math.pow(ladoA, 2)) + (Math.pow(ladoC, 2))) {
                rectangulo = true;
            }
        } else if (ladoC > ladoA && ladoC > ladoB) {
            if ((Math.pow(ladoC, 2)) == (Math.pow(ladoA, 2)) + (Math.pow(ladoB, 2))) {
                rectangulo = true;
            }
        }
        // Una vez sabemos si es rectángulo, continuamos con el resto de comprobaciones.
        // Dos lados iguales
        if ((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB)
                || (ladoB == ladoC && ladoB != ladoA)) {
            if (rectangulo) {
                System.out.println("Es un triángulo rectángulo e isósceles.");
            } else {
                System.out.println("Es un triángulo isósceles.");
            }
            // Tres lados iguales
        } else if (ladoA == ladoB && ladoB == ladoC) {
            if (rectangulo) {
                System.out.println("Es un triángulo rectángulo y equilátero.");
            } else {
                System.out.println("Es un triángulo equilátero.");
            }
        } else {
            if (rectangulo) {
                System.out.println("Es un triángulo rectángulo y escaleno.");
            } else {
                System.out.println("Es un triángulo escaleno.");
            }
        }

    }
}
