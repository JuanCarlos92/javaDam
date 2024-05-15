package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 13 trozoDeNumero:
 * De un número dado, devuelve un trozo indicado mediante dos posiciones.
 * 
 * @since 08-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio13trozoDeNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int resultado;
		int posicion1;
		int caracteres;
		int posicion2;
		
		System.out.println("Este programa extrae un trozo de un número dado, mediante dos posiciones indicadas.");	// Presentamos el programa
		System.out.println("-----------------------------------------------------------------------------------");

		System.out.print("Introduce un número: ");	// Solicitamos valores
		numero = scanner.nextInt();
		System.out.print("Introduce la posición inicial: ");
		posicion1 = scanner.nextInt();
		System.out.print("Introduce la posición final: ");
		posicion2 = scanner.nextInt();
		caracteres = Numeros.contarCaracteres(numero);
		
		while (caracteres < posicion1 || caracteres < posicion2 || posicion2 < posicion1) { //Comprobamos que los valores introducidos son válidos
			if (posicion2<posicion1) {
				System.out.println("ERROR: La segunda posición debe ser mayor o igual a la primera introducida."); 
			} else {
				System.out.println("Las posiciones indicadas son incorrectas. Alguna de ellas es mayor a la longitud del número inicial.");
			}
			System.out.print("Introduce la posición inicial: ");
			posicion1 = scanner.nextInt();
			System.out.print("Introduce la posición final: ");
			posicion2 = scanner.nextInt();
			caracteres = Numeros.contarCaracteres(numero);
		}
		resultado = Numeros.quitaPorDetras(numero, caracteres-posicion2);	  // Quitamos la parte sobrante de la cadena hasta llegar a la posición solicitada.
	  resultado = Numeros.quitaPorDelante(resultado, posicion1-1);				// Quitamos los caracteres iniciales solicitados
	  
	  System.out.println("El número resultante es "+resultado);
	}
}
