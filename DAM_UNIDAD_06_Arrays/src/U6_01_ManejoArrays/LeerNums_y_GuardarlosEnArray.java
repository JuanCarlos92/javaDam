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
public class LeerNums_y_GuardarlosEnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        float suma = 0;
        float media = 0;
        int mayor = 0;
        int menor = 0;
        int cont;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres que tenga la aplicacion: ");
        num = sc.nextInt();

        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Introduce el numero en la posicion " + i + ": ");
            array[i] = sc.nextInt();
        }
        // Mostramos todos los datos del array en sus posiciones 
        // Vamos sumando cada número del array para posteriormente realizar la media
        for (int i = 0; i < array.length; i++) {
            suma += array[i];

            if (mayor < array[i]) {
                mayor = array[i];
            }
            System.out.println("Posicion del array " + i + " elemento: " + array[i]);

        }
        //Decimos que menor es lo que vale valor para iniciarlo desde el numero mas grande.
        menor = mayor;
        //Buscamos el menor
        for (int i = 0; i < array.length; i++) {
            if (menor > array[i]) {
                menor = array[i];

            }
        }
        //calculo de la media
        media = suma / array.length;

        //contar las veces que se repite el numero
        for (int i = 0; i < array.length; i++) {
            cont = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cont++;

                }
            }
            System.out.println("El numero " + array[i] + " se repite " + cont + " veces");

        }
        System.out.println("---Resultado de los analisis realizados---");
        System.out.println("La suma es " + suma + " \nLa media es " + media + "\nEl mayor es " + mayor + "\nEl menor es " + menor);
        System.out.println("---Fin de la aplicacion---");
    }
}
