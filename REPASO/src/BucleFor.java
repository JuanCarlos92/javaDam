/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Juan Carlos
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa
        //termina cuando se introduce un espacio.

        String patata = "Patatostia";

        System.out.println(patata.length());

        for (int i = 0; i < patata.length(); i++) {
            System.out.print(patata.charAt(i));

            if (patata.charAt(i) == 'a' || patata.charAt(i) == 'e' || patata.charAt(i) == 'i' || patata.charAt(i) == 'o' || patata.charAt(i) == 'u')
                System.out.println(": Es vocal");
            else
                System.out.println(": No es vocal");
        }
    }
    
}
