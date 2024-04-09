/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package potencia;

/**
 *
 * @author Juan Carlos
 */
public class Potencia {
        public static int forPotencia(int base, int exponente) { //Metodo para calcular la potencia
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
}
