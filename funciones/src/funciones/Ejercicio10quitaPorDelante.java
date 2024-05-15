package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 10 quitaPorDelante:
 * Le quita a un número n dígitos por delante (por la izquierda).

 * @since 08-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio10quitaPorDelante {

	public static void main(String[] args) {
		// Declaramos variables
		Scanner scanner = new Scanner(System.in);
		int numero;
		int digitos;
		
		System.out.println("Este programa quita una cantidad de dígitos indicada por delante a un número entero.");		// Presentamos el programa
		System.out.println("-----------------------------------------------------------------------------------");

		System.out.println("Introduce un número: ");		// Solicitamos valores
		numero = scanner.nextInt();
		System.out.println("¿Cuántos dígitos quieres quitar?: ");
		digitos = scanner.nextInt();
	  
	  // Mostramos en pantalla:
	  System.out.println("El número resultante es "+Numeros.quitaPorDelante(numero, digitos)); // LLamamos a la función para quitar "digitos" por delante:
	}
}
