/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_08_ArrayCaracteres;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Array_de_caracteres {

//Crea un array que contenga las letras de la A a la Z.
//Pedir por teclado números de posiciones que nos permitirán coger la letra de esa
//posición.
//Si pedimos una posición incorrecta (ej. 100), nos dará un error.
//El proceso finalizará al introducir el -1. Entonces el sistema nos mostrará una cadena con
//todos los caracteres que hemos ido eligiendo. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }

        String cadena = "";
        int eleccion;

        do {
            System.out.print("Elija un indice entre 0 y " + mayusculas.length + ": ");
            eleccion = sc.nextInt();

            if (eleccion == -1) {
                System.out.println("El programa se ha detenido al introducir " + eleccion);
            } else if (eleccion == -1 && eleccion <= mayusculas.length - 1) {
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }

        } while (eleccion != -1);

        System.out.println(cadena);

    }

}
