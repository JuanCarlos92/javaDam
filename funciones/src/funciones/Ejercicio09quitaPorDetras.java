package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 9 quitaPorDetras:
 * Le quita a un número n dígitos por detrás (por la derecha).

 * @since 08-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio09quitaPorDetras {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int digitos;
		
		// Presentamos el programa
		System.out.println("Este programa quita una cantidad de dígitos indicada por detrás a un número entero.");
		System.out.println("----------------------------------------------------------------------------------");
		// Solicitamos valores
		System.out.println("Introduce un número: ");
		numero = scanner.nextInt();
		System.out.println("¿Cuántos dígitos quieres quitar?: ");
		digitos = scanner.nextInt();
	  
	  // Mostramos en pantalla:
	  System.out.println("El número resultante es "+Numeros.quitaPorDetras(numero, digitos)); //utilizamos la función quitaPorDetras.
	}
}
