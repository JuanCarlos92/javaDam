/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodowhile;

public class EjercicioDoWhile {

    public static void main(String[] args) {
        
        System.out.println("***** Primera Parte ***** ");
        int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        }while (numero<=10);
        
        System.out.println("***** Segunda Parte ***** ");
        int numero2 = 10;
        do {
            System.out.println(numero2);
            numero2--;
        }while (numero2 >= 0);
    }
}
