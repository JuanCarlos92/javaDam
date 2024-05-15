package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 3 esSiguientePrimo
 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 
 * VARIABLES A UTILIZAR
 * int numero - número introducido por el usuario a comprobar
 * boolean esPrimo - recibimos el valor verdadero o falso de la función que
 * comprueba si un número es primo.
 * 
 * ALGORITMO
 * - Recibimos un número por el usuario, pedimos que sea entero positivo.
 * - Antes de realizar la comprobación de si es primo, aumentamos el valor de numero en 1,
 * 	 ya que se solicita, el siguiente número primo, mayor al número dado, de forma que si
 * 	 número fuese primo, nos devuelva el siguiente mayor y no ese mismo.
 * - Realizamos comprobaciones en un ciclo, que va incrementando el valor de número, hasta
 * 	 que el resultado de la comparación sea verdadero.
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio03siguientePrimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 	// Declaramos variables
	  int numero;
	  boolean esPrimo;

	  System.out.println("Este programa nos indica el siguiente número primo tras recibir un número inicial: "); 	// Presentamos el programa
	  System.out.println("---------------------------------------------------------------------------------");
	  System.out.print("Introduce el número inicial: ");
	  numero = scanner.nextInt();
	  while (numero<=0) { // Comprobamos que el número introducido es entero positivo.
	  	System.out.println("Debes introducir un número entero positivo:");
	   	numero =scanner.nextInt();
	  }

	  do {
	  	numero++; // aumentanos numero para que empiece la comprobación a partir de numero+1 y después se vaya incrementando en cada ciclo.
		  esPrimo = Numeros.esPrimo(numero); 
	  } while (!esPrimo); // comprobamos, mediante la función esPrimo de Números, si es primo o no, cuando sea Primo, saldremos del bucle.
	    
	  System.out.println("El siguiente número primo es "+numero);
	}
}
