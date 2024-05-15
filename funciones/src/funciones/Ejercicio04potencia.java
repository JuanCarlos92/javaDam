package funciones;

import java.util.Scanner;

/**
 * 
 * Ejercicio 4 potencia
 * Dada una base y un exponente devuelve la potencia.
 * 
 * VARIABLES A UTILIZAR
 * double base -- número introducido por el usuario, puede ser un número real.
 * int exponente -- número introducido por el usuario, debe ser un número entero.
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio04potencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Declaramos variables
		double base;
		int exponente;
		
		System.out.println("Este programa calcula la potencia de una base y exponente dado.");	// Presentamos el programa
		System.out.println("--------------------------------------------------------------");

		System.out.println("Introduce la  base para calcular la potencia: ");		// Solicitamos valores
		base = scanner.nextDouble();
		System.out.println("Introduce el exponente de la potencia a calcular: ");
		exponente = scanner.nextInt();

		System.out.println("El resultado es "+Numeros.potencia(exponente, base)); // Llamamos a la función "potencia" y mostramos resultado.
	}
}
