package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 14 juntaNumeros:
 * Añade un número a otro número dado.
 * 
 * @since 08-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio14juntaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int resultado;
		int numero2;
		
		System.out.println("Este programa junta dos números dados.");	// Presentamos el programa
		System.out.println("-------------------------------------");

		System.out.print("Introduce el primer número: ");	// Solicitamos valores
		numero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		numero2 = scanner.nextInt();

	  // Mostramos en pantalla:
	  System.out.println("El número resultante es "+Numeros.juntaNumeros(numero, numero2)); // utilizamos función juntaNumeros
	}
}
