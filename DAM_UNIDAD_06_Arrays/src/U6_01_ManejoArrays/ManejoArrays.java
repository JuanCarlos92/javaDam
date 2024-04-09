/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_01_ManejoArrays;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class ManejoArrays {

    /**
     * Realizar una aplicación que lea 10 números por teclado y los guarde en un
     * array. Una vez almacenados, la aplicación nos dará los siguientes
     * resultados:
     *
     *  La media de todos los números positivos introducidos 
     *  El mayor de todos los números 
     *  El menor de los números introducidos 
     *  La cuenta de las veces que se repite cada número.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float promedio = 0;
        float suma = 0;
        int mayor = 0;
        int menor = 0;
        int num;
        System.out.print("Cuantos numeros quiere que tenga la aplicacion ?: ");
        num = sc.nextInt();

        int[] miArray = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Introduzca el numero en la posicion " + (i) + " :");
            miArray[i] = sc.nextInt();
        }
        // Mostramos todos los datos del array en sus posiciones | vamos sumando cada número del array para posteriormente realizar la media
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
            //Si mayor es menor que posicionArray entonces... 
            //el numero mayor se va a la variable mayor
            if (mayor < miArray[i]) {
                mayor = miArray[i];
            }
            //Mostramos todos los elementos del Array
            System.out.println(String.format("Posicion [%d] Elemento: %d", i, miArray[i]));
        }
        //Decimos que menor es lo que vale valor para iniciarlo desde el numero mas grande.
        menor = mayor;

        // Buscamos el menor;
        for (int i = 0; i < miArray.length; i++) {
            //Si menor es mayor a posicionArray entonces...
            //el numero menor se va a la variable menor
            if (menor > miArray[i]) {
                menor = miArray[i];
            }
        }
        //calculamos la Media
        promedio = suma / miArray.length;

        //contar las veces que se repite cada número
        int cont;
        for (int i = 0; i < miArray.length; i++) {
            cont = 0;
            for (int j = i; j < miArray.length; j++) {
                if (miArray[i] == miArray[j]) {
                    cont++;
                }
            }
            System.out.println(String.format("El numero %d se repite %d veces",
                    miArray[i], cont));
        }
        System.out.println("***Resultados de los analisis realizados***");
        System.out.println(String.format("La suma es %.2f. La media es %.2f. El mayor es %d. El menor es %d",
                suma, promedio, mayor, menor));
        System.out.println("***Fin de la aplicacion***");

        
    }
}
