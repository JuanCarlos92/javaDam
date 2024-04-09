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
public class LeerNums_y_GuardadosEnArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float suma = 0;
        float promedio = 0;
        int mayor = 0;
        int menor = 0;
        int num;
        int contador;
        Scanner sc = new Scanner(System.in);
        //pide cuantos numeros tiene el array
        System.out.print("Introduce cuantos numeros quieres introducir: ");
        num = sc.nextInt();

        //pide num de  cada posicion
        int[] numArray = new int[num];
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Introduce el num en la posicion " + i + ": ");
            numArray[i] = sc.nextInt();
        }
        //suma y calcular mayor
        for (int i = 0; i < numArray.length; i++) {
            suma += numArray[i];
            if (mayor < numArray[i]) {
                mayor = numArray[i];
            }
            System.out.println("Posicion de array: " + i + "elemento: " + numArray[i]);
        }
        //caluclar menor
        menor = mayor;
        for (int i = 0; i < numArray.length; i++) {
            if (menor > numArray[i]) {
                menor = numArray[i];
            }
        }
        //media
        promedio = suma/numArray.length;
        
        //contar veces que se repite
        for (int i = 0; i < numArray.length; i++) {
            
        contador = 0;
            for (int j = i; j < numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    contador++;

                }
            }
            System.out.println("El numero " + numArray[i] + " se repite " + contador + " veces");

        }
        System.out.println("---Resultado de los analisis realizados---");
        System.out.println("La suma es " + suma + " \nLa media es " + promedio + "\nEl mayor es " + mayor + "\nEl menor es " + menor);
        System.out.println("---Fin de la aplicacion---");
    }

}
