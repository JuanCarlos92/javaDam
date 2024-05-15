package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 6
 * Este programa pasa a cadena un número, y lo voltea.
 * 
 * VARIABLES
 * int numero - valor introducido por el usuario.
 * 
 * ALGORITMO
 * Leemos por teclado el valor a voltear.
 * Llamamos a la función "voltea" y mostramos resultado en pantalla.
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio06voltea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Este programa voltea el número (entero) introducido:");		// Presentación del programa
		System.out.println("----------------------------------------------------");
		
		System.out.print("Introduce un número: ");		// Solicitamos introducción de parámetros
		numero = scanner.nextInt();
		
		System.out.println("El número volteado es "+Numeros.voltea(numero)); // Muestra resultado
	}
}
