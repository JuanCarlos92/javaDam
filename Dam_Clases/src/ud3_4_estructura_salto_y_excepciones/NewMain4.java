/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud3_4_estructura_salto_y_excepciones; // este es el nombre de nuestro proyecto

import java.util.Scanner; // esta es la línea a introducir.

/**
 *
 * @author Juan Carlos
 */
public class NewMain4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero = 0;
        String nombre = lector.nextLine();
        int n1 = lector.nextInt();
        int n2 = lector.nextInt();

        lector.close();

        System.out.println("Hola ... " + nombre + " el numero 1 es " + n1 + " el numero dos es " + n2);
        /////////////////////////////////////////////////////
        /*
            Si introducimos aquí fuera del bloque try 
            esta línea
            El programa se romperá y el flujo no saldrá por el final de nuestras
            funciones.numero = n1 / n2;
         */
        ///////////////////////////////////////////////////////////////////////////////////////////
        try {
            numero = n1 / n2;
            System.out.println("Hola ... " + nombre + " el numero 1 es " + n1 + " el numero dos es " + n2 + " la division es  " + numero);
        } catch (Exception e) {
            System.out.println("Hola ... " + nombre + " el numero 1 es " + n1 + " el numero dos es " + n2 + " no se pueden dividir  " + e.getMessage());
        }

        System.out.println("Todo acaba bien");
    }

}
