import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio01MayorMenor {

    /*Ejercicio 1: Realiza un programa que reciba dos números por teclado 
    e indique cuál es mayor o si son iguales.*/
    
    public static void main(String[] args) {
        
        //Crear clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedir los dos numeros
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        
        sc.close();
        
        //Si num1 mayor num2 muestralo por pantalla
        if (num1 > num2) {
            System.out.println( "El primer numero es mayor que el segundo " + num1 + " > " + num2);   
        }
        //Si num2 mayor num1 muestralo por pantalla
        else if (num2 > num1) {
            System.out.println( "El segundo numero es mayor que el primero " + num2 + " > " + num1);   
          
        }
        //Si no di que son iguales
        else{
            System.out.println( "Los dos numeros son iguales"); 
        }
    }
    
}