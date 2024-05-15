package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 2 esPrimo
 * Devuelve verdadero si el número que se pasa como parámetro es primo y
 * falso en caso contrario.
 * 
 * VARIABLES A UTILIZAR
 * int numeroIntroducido - número que introduce el usuario para hacer la comprobación.
 * 
 * ALGORITMO
 * Recibimos número por pantalla
 * Llamamos función "esPrimo", si el valor es verdadero, el número es primo, en caso
 * contrario no. 
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio02esPrimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    int numeroIntroducido; 
    
    System.out.println("Este programa nos devuelve si un número es primo: ");  // Presentamos el programa
    System.out.println("------------------------------------------------");
    System.out.print("Introduce el número a calcular: ");
    numeroIntroducido = scanner.nextInt();
    while (numeroIntroducido<=0) {	// Comprobamos que el número introducio es un número entero positivo.
    	System.out.println("Debes introducir un número entero positivo:");
    	numeroIntroducido =scanner.nextInt();
    }
 
    if (Numeros.esPrimo(numeroIntroducido)) { // Llamamos a la función "esPrimo" para obtener el resultado correcto.
    	System.out.println("El número introducido ES PRIMO");
    }else {
    	System.out.println("El número introducido NO ES PRIMO");
    }
	}
}
