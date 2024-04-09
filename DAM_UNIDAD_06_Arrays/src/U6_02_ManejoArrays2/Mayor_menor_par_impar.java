/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_02_ManejoArrays2;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Mayor_menor_par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int mayor = 0;
        int menor = 0;
        int par = 0;
        int impar = 0;
        int posicionArray;
        Scanner sc = new Scanner(System.in);
        System.out.print("De cuanto numeros quieres que sea el array?: ");
        num = sc.nextInt();

        int arrayNum[] = new int[num];

        for (int i = 0; i < arrayNum.length; i++) {
            posicionArray = i+1;
            System.out.println("Numero[" + posicionArray + "]: ");
            arrayNum[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayNum.length; i++) {
            if (mayor < arrayNum[i]) {
                mayor = arrayNum[i];
            }
        }
        menor = mayor;
        for (int i = 0; i < arrayNum.length; i++) {
            if (menor > arrayNum[i]) {
                menor = arrayNum[i];
            }
        }
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
        }
        System.out.println("El numero mayor es el: " + mayor);
        System.out.println("El numero menor es el: " + menor);
        System.out.println("El numero de pares totales son de: " + par);
        System.out.println("El numero de impares totales son de: " + impar);

    }

}
