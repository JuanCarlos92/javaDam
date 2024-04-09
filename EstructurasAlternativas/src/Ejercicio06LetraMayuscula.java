
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio06LetraMayuscula {

     //Ejercicio 6: Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
    
    public static void main(String[] args) {
        //Crear el objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Leer cadena por teclado
        System.out.println("Introduce una  cadena de caracteres: ");
        String cadena = sc.nextLine();
        
        sc.close();
        // Realizamos Cálculos y mostramos en pantalla
        if(cadena.length()!=1 ){
            System.out.println("La cadena no es una letra mayúscula");
        }
        // }else if ((cadena > "A") && (cadena < "Z")) {
        else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
            System.out.println("La cadena es una letra mayúscula.");
        }
        else {
        System.out.println("La cadena no es una letra mayúscula.");
        }
        
        }
    }