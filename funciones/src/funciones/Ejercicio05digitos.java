package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 5 digitos
 * Cuenta el número de dígitos de un número entero.
 * 
 * VARIABLES
 * int numero - es el valor introducido por el usuario y que debemos valorar.
 * 
 * ALGORITMO
 * Pedimos valor por teclado
 * Mostramos resultado tras llamada a la funcion contarCaracteres.
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio05digitos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	   int numero;
	 
	   System.out.println("Este programa cuenta el número de dígitos de un número entero."); // Presentamos el programa
	   System.out.println("-------------------------------------------------------------");
	   System.out.println("Introduce un número: ");	// Solicitamos valor
	   numero = scanner.nextInt();
	   
	   System.out.println("El número "+numero+" tiene "+Numeros.contarCaracteres(numero)+" caracteres"); // Mostramos resultado en pantalla tras llamar a contarCaracteres
	}
}
