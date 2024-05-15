package funciones;

import java.util.Scanner;
import funciones.Numeros;

/**
 * 
 * Ejercicio 8 posicionDeDigito:
 * Da la posición de la primera ocurrencia de un dígito 
 * dentro de un número entero. Si no se encuentra, devuelve -1
 * 
 * 
 * @since 08-12-2019
 * @author manuelhidalgo
 *
 */

public class Ejercicio08posicionDeDigito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// Declaramos variables
		int numero;
		String numeroCadena;
		int digito;
		int caracteres;
		String digitoCadena;
		boolean estaEnCadena = false;
		
	  System.out.println("Este programa da la posición de la primera ocurrencia de un dígito dentro de un número entero."); // Presentamos el programa
	  System.out.println("---------------------------------------------------------------------------------------------");

	  System.out.println("Introduce un número: ");	// Solicitamos valores
	  numero = scanner.nextInt();
	  System.out.println("¿Qué dígito quieres buscar?: ");
	  digito = scanner.nextInt();
	  		
	  numeroCadena = Numeros.convertirNumeroCadena(numero);	// Convertimos en cadena
	  digitoCadena = Numeros.convertirNumeroCadena(digito);
	  
	  caracteres = Numeros.contarCaracteres(numero);	// Buscar en una cadena. Utilizamos contarCaracteres para saber la longitud máxima del ciclo.
	  for (int i=0; i<caracteres; i++) {
	  	if (digitoCadena.equals(numeroCadena.substring(i,i+1))) {
	  		System.out.println("El número "+digito+" se encuentra por primera vez en la posición "+(i+1));
	  		estaEnCadena = true;
	  		break;
	  	}
	  }
	  if (!estaEnCadena) {
	  	System.out.println("El número "+digito+" no se encuentra en la cadena. -1");
	  }
	}
}
