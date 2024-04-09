
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio07Potencia {

    
    /*Ejercicio 7: Realiza un programa que calcule la potencia de un número, dado este y su exponente. Pueden ocurrir tres casos:
    * El exponente sea positivo: imprime resultado en pantalla.
    * El exponente sea 0, el resultado es 1.
    * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.*/
    public static void main(String[] args) {
        
        //Crear el objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedir por pantalla la base y exponente
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        int expo = sc.nextInt();
        
        sc.close();
        
       
        
        if (expo >0) {
            int resultado = 1;
            for (int i = 1; i<=expo; i++) {
                resultado= resultado * base;  
            }
            System.out.println("La potencia es: " + resultado);
            
        }
        
        if (expo == 0) {
            int resultado2 = 1;
            System.out.println("Al ser el exponente 0, el resultado es: " + resultado2); 
        }
        
        if (expo <0) {
            double resultado3 = 1;
            expo = Math.abs(expo);
            for (int i = 1; i<=expo; i++) {
                resultado3= resultado3 * base;  
            }
            resultado3 = 1/resultado3;
            System.out.println("La potencia es: " + resultado3);
            
        }
    }

}