/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjercicioDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("***** Primera Parte ***** ");
        int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 10);

        System.out.println("***** Segunda Parte ***** ");
        int numero2 = 10;
        do {
            System.out.println(numero2);
            numero2--;
        } while (numero2 >= 0);
    }

}
