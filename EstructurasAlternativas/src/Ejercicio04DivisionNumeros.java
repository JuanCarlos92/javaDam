
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio04DivisionNumeros {


    /*Ejercicio 4: Crea un programa que pida al usuario dos números y muestre el
    resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.*/
    
    public static void main(String[] args) {
        //Crear clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedir los dos numeros
        System.out.println("Introduce el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();
        
        sc.close();
        
        //Si el num2 es 0 muestrar un mensaje de error
        if (num2 == 0) {
            System.out.println("ERROR EL SEGUNDO NUMERO NO PUEDE SER 0");
        }
        //Sino, realiza la division 
        else {
            double resultado = num1/num2;
             System.out.println("El resultado de la division es: " + resultado);
        }
    }
    
}
