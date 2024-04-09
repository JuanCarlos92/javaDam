/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class For2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =4;
        int factorial =1; // Variable donde vamos a acumular el resultado 
         
        // Calcular el factorial de a 
        for (int i = 1; i<= a; i++) {
            factorial=factorial*i;
        }
        System.out.println("El factorial de " + a + " es " +factorial);
    }
    
}
