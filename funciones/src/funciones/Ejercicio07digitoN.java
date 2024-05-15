package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 7 digitoN
 * Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * VARIABLES
 * int numero - Valor inicial del número entero introducido por el usuario.
 * String numeroCadena - variable para almacenar el número inicial, convertido a cadena.
 * int posicion - número de posición del dígito que debemos leer de la cadena.
 * 
 * ALGORITMO
 * -Pedimos valores de numero y digito
 * -Comprobamos que la posición se enciuentra entre 0 y la longitud máxima de dígitos.
 * - Llamamos a la función convertirNumeroCadena para obtener el número incial en String
 * - Buscamos el dígito concreto mediante substring y usando las posiciones facilitadas por el usuario.
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio07digitoN {

	public static void main(String[] args) {
		// Declaramos variables
		Scanner scanner = new Scanner(System.in);
		int numero;
		String numeroCadena;
		int posicion;
		
	  System.out.println("Este programa devuelve el dígito que está en la posición n de un número entero.");	// Presentamos el programa
	  System.out.println("------------------------------------------------------------------------------");

	  System.out.println("Introduce un número: ");	// Solicitamos valores
	  numero = scanner.nextInt();
	  System.out.println("¿Qué posición quieres buscar?: ");
	  posicion = scanner.nextInt();
	  
	  while (posicion>=Numeros.contarCaracteres(numero) || posicion < 0){ // Comprobamos que las posiciones son correctas.
	  	System.out.println("ERROR: La posición solicitada es incorrecta.");
	  	System.out.println("Introduzca una nueva posición: ");
	  	posicion = scanner.nextInt();
	  }
		numeroCadena = Numeros.convertirNumeroCadena(numero); // llamamos a la función numero cadena para convertir en caracter.
	  System.out.println(numeroCadena.substring(posicion, posicion+1));	// buscamos el dígito en concreto dentro de la cadena.
	}
}
