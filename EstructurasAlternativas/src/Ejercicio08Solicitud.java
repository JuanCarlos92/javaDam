
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio08Solicitud {

    
    //Ejercicio 8: Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
    //* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
    //* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
    //* Otros casos -> NO ACEPTADA
    
    public static void main(String[] args) {
        //Crear un objeto de la clase scanner
        Scanner sc = new Scanner(System.in);
        //Pedir la edad
        System.out.println("Introduce tu edad: " );
        int edad= sc.nextInt();
        //Pedir la nota
        System.out.println("Introduce la nota: " );
        double nota = sc.nextDouble();
        //Pedir el sexo
        System.out.println("Introduce el sexo: " );
        String sexo = sc.next();
        
        sc.close();
        
        if (nota >=5 && edad >=18 && "M".equals(sexo)) {
            System.out.println("POSIBLE");
        }
        else if (nota >=5 && edad >=18 && "F".equals(sexo)) {
            System.out.println("ACEPTABLE");
        }
        else{
            System.out.println("El sexo no es correcto");
        }
    }
    
}