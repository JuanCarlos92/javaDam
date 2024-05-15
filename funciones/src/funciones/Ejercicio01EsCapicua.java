package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 1 esCapicua
 * Devuelve verdadero si el número que se pasa como paráme- tro es capicúa y 
 * falso en caso contrario.
 * 
 * VARIABLES A UTILIZAR
 * int numero - Número introducido por el usuario
 * 
 * ALGORITMO
 * comparar si un número es igual al mismo invertido. Si lo es, es capicúa.
 * 
 * @since 06-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio01EsCapicua {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero; // variable para la introducción por pantalla por parte del usuario.
		
		System.out.println("Este programa comprueba si un número es capicúo"); // Presentación del programa
		System.out.println("-----------------------------------------------");
		
		System.out.print("Introduce un número: "); // Solicitamos introducción de parámetros
		numero = scanner.nextInt();
		
		if (numero == Numeros.voltea(numero)) { 	// llamamos a la función "voltea" para poder comparar si
																							// numero es igual a su inverso, y por tanto capicuo.
			System.out.println("El número introducido ES CAPICÚO");
		} else {
			System.out.println("El número introducido NO ES CAPICÚO");
		}
	}
}
