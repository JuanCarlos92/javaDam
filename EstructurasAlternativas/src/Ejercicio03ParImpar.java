
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio03ParImpar {
//Ejercicio 3: Realiza un programa que pida un número por teclado y nos indique si es par o impar.
    
    public static void main(String[] args) {
         //Crear clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedir los dos numeros
        System.out.println("Introduce el primer numero: ");
        int num = sc.nextInt();
        
        sc.close();
        
        //Si num da de resto 0 es par
        if (num%2==0) {
            System.out.println("Es par");
  
        }
        //Sino es impar
        else{
            System.out.println("Es impar");
        }
        
    }
    
}
