package funciones;

import java.util.Scanner;

/**
 * 
 * @author manuelhidalgo
 * @since 06-12-2019
 */


public class Numeros {
	
	public static String convertirNumeroCadena (int numero) {
		/**
		 * Esta función convierte un número entero a cadena.
		 */
		String numeroCadena;
		
		// Convertimos número a cadena
		numeroCadena = Integer.toString(numero);
			
		return numeroCadena;
	}
	
	public static int contarCaracteres(int numero) {
		/**
		 * Esta función cuenta el número de caracteres de un número entero.
		 */
		String numeroCadena;
		int caracteres;
		
		// Convertimos número a cadena
		numeroCadena = convertirNumeroCadena(numero);
			
		// Realizamos la cuenta de carácteres de numeroCadena
		caracteres = numeroCadena.length();
			
		return caracteres;
	}
	
	public static int voltea(int numero) {
		/**
		 * Esta función devuelve un número invertido.
		 */
		String numeroCadena;
		int caracteresCadena;
		String cadenaInvertida = "";
		int cadenaInvertidaFinal;
		
		// Convertimos número a cadena
		numeroCadena = convertirNumeroCadena(numero);
			
		// Realizamos la cuenta de carácteres de numeroCadena
		caracteresCadena = numeroCadena.length();
			
		// Realizamos ciclo para rellenar la cadenaInvertida:
		for (int i=caracteresCadena-1; i>=0;i--) {
			cadenaInvertida = cadenaInvertida+numeroCadena.substring(i,i+1);
		}
		// Asignamos valor de cadenaInvertida a cadenaInvertidaFinal como entero.
		cadenaInvertidaFinal = Integer.parseInt(cadenaInvertida);
		
		// Devolvemos valor.
		return cadenaInvertidaFinal;
	}
	
	public static int quitaPorDetras(int numero, int digitos) {
		/**
		 * Esta función devuelve un número quitando n digitos por detrás.
		 */
		String numeroCadena;
		int caracteresCadena;
		String cadenaRecortada = "";
		int cadenaRecortadaFinal;
		
		// Convertimos número a cadena
		numeroCadena = convertirNumeroCadena(numero);
			
		// Realizamos la cuenta de carácteres de numeroCadena
		caracteresCadena = numeroCadena.length();
			
		// Realizamos ciclo para rellenar la cadenaInvertida:
		for (int i=0; i<caracteresCadena-digitos;i++) {
			cadenaRecortada = cadenaRecortada+numeroCadena.substring(i,i+1);
		}
		// Asignamos valor de cadenaInvertida a cadenaInvertidaFinal como entero.
		cadenaRecortadaFinal = Integer.parseInt(cadenaRecortada);
		
		// Devolvemos valor.
		return cadenaRecortadaFinal;
	}
	
	public static int quitaPorDelante(int numero, int digitos) {
		/**
		 * Esta función devuelve un número quitando n digitos por delante.
		 */
		String numeroCadena;
		int caracteresCadena;
		String cadenaRecortada = "";
		int cadenaRecortadaFinal;
		
		// Convertimos número a cadena
		numeroCadena = convertirNumeroCadena(numero);
			
		// Realizamos la cuenta de carácteres de numeroCadena
		caracteresCadena = numeroCadena.length();
			
		// Realizamos ciclo para rellenar la cadenaInvertida:
		for (int i=digitos; i<caracteresCadena;i++) {
			cadenaRecortada = cadenaRecortada+numeroCadena.substring(i,i+1);
		}
		// Asignamos valor de cadenaInvertida a cadenaInvertidaFinal como entero.
		cadenaRecortadaFinal = Integer.parseInt(cadenaRecortada);
		
		// Devolvemos valor.
		return cadenaRecortadaFinal;
	}
	
//	public static int pegaPorDetras (int numero, int numeroDos) {
//		/**
//		 * Esta función devuelve un número añadiendo otro detras.
//		 */
//		String numeroCadena;
//		int caracteresCadena;
//		String cadenaRecortada = "";
//		int cadenaRecortadaFinal;
//		
//		// Convertimos número a cadena
//		numeroCadena = convertirNumeroCadena(numero);
//			
//		// Realizamos la cuenta de carácteres de numeroCadena
//		caracteresCadena = numeroCadena.length();
//			
//		// Realizamos ciclo para rellenar la cadena:
//		for (int i=numeroDos; i<caracteresCadena;i++) {
//			cadenaRecortada = cadenaRecortada+numeroCadena.substring(i,i+1);
//		}
//		// Asignamos valor de cadenaInvertida a cadenaInvertidaFinal como entero.
//		cadenaRecortadaFinal = Integer.parseInt(cadenaRecortada);
//		
//		// Devolvemos valor.
//		return cadenaRecortadaFinal;
//	}
//	
	public static int juntaNumeros (int numero, int numero2) {
		/**
		 * Esta función junta dos números enteros.
		 */
		int resultado;
		// Calculamos resultado para la suma de dos dígitos enteros.
		resultado = Integer.parseInt(numero+""+numero2);
		
		// Devolvemos valor.
		return resultado;
	}
	
	public static boolean esPrimo(int numero) {
		/**
		 * Esta función comprueba si un número es primo o no.
		 */
    boolean esPrimo = true;
    int divisor =2;
   	// Calculamos si un número es primo
   	if (numero==2) {
 			esPrimo = true;
 		}else if (numero==3) {
 			esPrimo = true;
 		}
  	
   	while ((divisor<=Math.sqrt((numero))) && esPrimo == true) {
     if (numero%divisor==0) {
       esPrimo = false;
     }
     divisor++;
   	}
    // Devolución resultado
   	return esPrimo;

	}
	
	public static double potencia (int exponente, double base) {
		/**
		 * Esta función realiza el cálculo de una potencia, recibiendo su base y exponente.
		 */
    double resultado;
    
   	// Recibimos una base  y exponente, según valor del exponente realizamos operaciones.
  	if (exponente == 0) {
			resultado = 1;
		} else if (exponente > 0){
			resultado =1;
			for (int i=0; i<exponente;i++) {
				resultado = resultado * base;
			}
		} else {
			resultado=1;
			for (int i=0; i<Math.abs(exponente);i++) {
				resultado = resultado * base;
			}
			resultado = 1/resultado;
		}
  	return resultado;
	}
}
