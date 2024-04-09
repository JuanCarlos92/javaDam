/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U4_01;

import utilidadesMatematicas.racional;

/**
 *
 * @author Juan Carlos
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        racional r1 = new racional(3,4);
        racional r2 = new racional(1,2);
        racional resultado = r1.sumar(r2);
        resultado.imprimirRacional();
        resultado = r1.restar(r2);
	resultado.imprimirRacional();
	resultado = r1.multiplicacion(r2);
	resultado.imprimirRacional();
	resultado = r1.division(r2);
	resultado.imprimirRacional();
    }
    
}
