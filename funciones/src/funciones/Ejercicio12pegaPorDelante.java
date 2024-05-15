package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 12 pegaPorDelante:
 * Añade un dígito a un número dado por delante.
 * 
 * @since 09-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio12pegaPorDelante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int digito;
		int caracteres;

		System.out.println("Este programa pega un dígito por detrá a un número entero dado.");		// Presentamos el programa
		System.out.println("---------------------------------------------------------------");

		System.out.println("Introduce un número: ");	// Solicitamos valores
		numero = scanner.nextInt();
		System.out.println("Introduce un dígito a pegar por delante ");
		digito = scanner.nextInt();
		caracteres = Numeros.contarCaracteres(digito);
				
		while (caracteres !=1) { // Comprobamos que el número introducido es un sólo dígito
			System.out.println("ERROR: Debes introducir un número de un sólo dígito.");
			System.out.println("Introduce el dígito a pegar por delante:");
			digito = scanner.nextInt();
			caracteres = Numeros.contarCaracteres(digito);
		}
	  System.out.println("El número resultante es "+Integer.parseInt(digito+""+numero)); // Calculamos número resultante y mostramos en pantalla.
	}
}
